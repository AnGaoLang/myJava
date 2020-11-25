package com.myjava.myjava.mapper;

import com.myjava.myjava.entity.Account;
import java.util.List;

public interface IAccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
