package com.gmall.user.controller;

import com.gmall.user.bean.UmsMember;
import com.gmall.user.bean.UmsMemberReceiveAddress;
import com.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("user")
    @ResponseBody
    public List<UmsMember> user(){
        List<UmsMember> umsMembers = userService.queryUser();
        return umsMembers;
    }

    @RequestMapping("Useraddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> queryAddress(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.queryAddressById(memberId);
        return umsMemberReceiveAddresses;
    }

}
