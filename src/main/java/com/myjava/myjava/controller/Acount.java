package com.myjava.myjava.controller;

import com.myjava.myjava.entity.Account;
import com.myjava.myjava.services.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class Acount {
    @Autowired
    IAccountService accountService;

    @GetMapping("/list")
    public List<Account> getAccounts() {
        return accountService.findAccountList();
    }

    @GetMapping("/{id}")
    public Account getAccount(@PathVariable("id") int id) {
        return accountService.findAccountById(id);
    }

    @PutMapping("/{id}")
    public String updateAccount(@PathVariable("id") int id,
        @RequestParam(value = "name", required = true) String name,
        @RequestParam(value = "money", required = true) double money) {
        int t = accountService.update(id, name, money);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @PostMapping("/add")
    public String addAccount(@RequestParam(value = "name", required = true) String name,
      @RequestParam(value = "money", required = true) double money) {
        int t = accountService.add(name, money);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }
    }
}
