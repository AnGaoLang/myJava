package com.myjava.myjava.services;

import java.util.List;

import com.myjava.myjava.entity.Account;

public interface IAccountService {
    int add(String name, double money);

    int update(int id, String name, double money);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
