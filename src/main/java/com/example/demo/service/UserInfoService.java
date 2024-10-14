package com.example.demo.service;

import com.example.demo.model.UserInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoService {
    public List<UserInfo> getUserInfoList(){
        List<UserInfo> userInfoList = new ArrayList<>();
        UserInfo userInfo1 = new UserInfo();
        userInfo1.setId(1);
        userInfo1.setName("Md. Nazmul");
        userInfo1.setEmail("nazmulict@gmail.com");
        userInfoList.add(userInfo1);

        UserInfo userInfo2 = new UserInfo();
        userInfo2.setId(2);
        userInfo2.setName("Md. Kamal");
        userInfo2.setEmail("kamal@gmail.com");
        userInfoList.add(userInfo2);
        return userInfoList;
    }
}
