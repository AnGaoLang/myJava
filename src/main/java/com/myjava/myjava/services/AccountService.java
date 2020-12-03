package com.myjava.myjava.services;

import com.myjava.myjava.entity.Account;
import com.myjava.myjava.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int add(String name, double money) {
        return accountMapper.add(name, money);
    }

    @Override
    public int update(int id, String name, double money) {
        return accountMapper.update(id, name, money);
    }

    @Override
    public int delete(int id) {
        return accountMapper.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountMapper.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountMapper.findAccountList();
    }
}
