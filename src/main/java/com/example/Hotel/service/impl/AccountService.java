package com.example.Hotel.service.impl;

import com.example.Hotel.entity.Account;
import com.example.Hotel.entity.MyTrips;
import com.example.Hotel.exeptions.AccountNotFoundExeption;
import com.example.Hotel.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements UserDetailsService {
    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public AccountService(final AccountRepository accountRepository, final PasswordEncoder passwordEncoder) {
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Long save(String name, String surrname, String email, String password, List<MyTrips> myTrips) {
        final Account account = new Account(name, surrname, email, password, myTrips);
        final String encodedPassword = passwordEncoder.encode(account.getPassword());
        account.setPassword(encodedPassword);

        return accountRepository.save(account).getAccountId();
    }

    public Account getById(Long accountId) {
        return accountRepository.findById(accountId)
                .orElseThrow(() -> new AccountNotFoundExeption("Unable to find account with id: " + accountId));
    }

    public List<Account> getAll(){
        final List<Account> accounts = accountRepository.findAll();
        return accounts;
    }

    public Account update(Account account) {
//        account.addTrip(newTrip);

        return accountRepository.save(account);
    }

    public Optional<Account> findByUsername(final String username) {
        return this.accountRepository.findAccountByEmail(username);
    }

    @Override
    public UserDetails loadUserByUsername(final String username) {
        final Account account = this.accountRepository.findAccountByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with username: " + username + "was not found"));

        List<SimpleGrantedAuthority> authorities = Collections.singletonList(new SimpleGrantedAuthority("user"));

        return new User(account.getEmail(), account.getPassword(), authorities);
    }

   /* public Account updates (Long accountId, String indate, String outdate, String hotel, String description){
        Account account = getById(accountId);
        MyTrips myTrips = account.getMytrips().stream().findAny().orElseThrow(() -> new AccountNotFoundExeption("Unable to find mytrips for account with id: " + accountId));
        return account;
    }*/
}
