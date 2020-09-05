package com.sgg.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.bean.UmsMember;
import com.gmall.bean.UmsMemberReceiveAddress;
import com.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    /*这里不用autowire 因为不在同一个容器里*/
    @Reference
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
