package com.example.demo.controller;

import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserInfoAPIController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/users")
    public ResponseEntity<List<UserInfo>> getUserLis() {
        List<UserInfo> userInfoList = userInfoService.getUserInfoList();
        return new ResponseEntity<>(userInfoList, HttpStatus.OK);
    }
}
