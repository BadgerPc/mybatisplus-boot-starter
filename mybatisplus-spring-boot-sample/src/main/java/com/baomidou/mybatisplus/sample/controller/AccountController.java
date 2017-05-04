package com.baomidou.mybatisplus.sample.controller;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.sample.entity.Account;
import com.baomidou.mybatisplus.sample.service.IAccountService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-02-20
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @ResponseBody
    @GetMapping("/list")
    public List<Account> list() {
        return accountService.selectList(null);
    }

    @ResponseBody
    @GetMapping("/save")
    public String save() {
        Account account = new Account();
        account.setSex(new Random().nextInt(1));
        account.setUserName("三毛-" + new Random().nextInt(100));
        account.setCreateTime(new Date());
        accountService.insert(account);
        return "插入成功！返回 ID: " + account.getId();
    }

    @ResponseBody
    @GetMapping("/delete")
    public String delete() {
        return "删除所有！结果: " + accountService.delete(null);
    }

}
