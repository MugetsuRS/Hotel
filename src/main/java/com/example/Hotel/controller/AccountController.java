package com.example.Hotel.controller;

import com.example.Hotel.controller.dto.AccountRequestDTO;
import com.example.Hotel.controller.dto.AccountResponseDTO;
import com.example.Hotel.entity.Account;
import com.example.Hotel.entity.MyTrips;
import com.example.Hotel.service.impl.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/auth")
    public ResponseEntity<Account> auth(@RequestParam final String username, @RequestParam final String password) {
        final Account account = this.accountService.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with username: " + username + "was not found"));

        return ResponseEntity.ok(account);
    }

    @GetMapping("/accounts/{accountId}")
    public AccountResponseDTO getById(@PathVariable Long accountId) {
        return new AccountResponseDTO(accountService.getById(accountId));
    }

    @PostMapping("/accounts")
    public Long create(@RequestBody AccountRequestDTO accountRequestDTO) {
        return accountService.save(accountRequestDTO.getName(), accountRequestDTO.getSurrname(), accountRequestDTO.getPassword(), accountRequestDTO.getEmail(),
                accountRequestDTO.getMytrips().stream().map(myTripsRequestDTO -> new MyTrips(myTripsRequestDTO.getIndate(), myTripsRequestDTO.getOutdate(),
                        myTripsRequestDTO.getHotel(), myTripsRequestDTO.getDescription())).collect(Collectors.toList()));
    }
    @GetMapping("/accounts/all")
    public ResponseEntity <List<Account>> getAcc(){
        final List<Account> accounts = accountService.getAll();
        return ResponseEntity.ok(accounts);

    }

}












