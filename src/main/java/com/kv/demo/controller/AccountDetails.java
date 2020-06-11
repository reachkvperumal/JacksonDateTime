package com.kv.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountDetails {

  @PostMapping("/create")
  @ResponseBody
  public AccountDetailRes addAccount(@RequestBody AccountDetailReq req) {
    System.out.println(req.getCreatedOn());
    System.out.println(req.getDob());
    AccountDetailRes res = new AccountDetailRes();
    res.setCreatedOn(req.getCreatedOn());
    res.setDob(req.getDob());
    res.setFirstName(req.getFirstName());
    res.setLastName(req.getLastName());
    return res;
  }

}
