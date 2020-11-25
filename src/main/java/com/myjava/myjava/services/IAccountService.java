package com.myjava.myjava.services;

import java.util.List;

import com.myjava.myjava.entity.Account;

public interface IAccountService {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
