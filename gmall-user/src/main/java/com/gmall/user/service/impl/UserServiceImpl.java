package com.gmall.user.service.impl;

import com.gmall.user.bean.UmsMember;
import com.gmall.user.bean.UmsMemberReceiveAddress;
import com.gmall.user.mapper.UmsMemberReceiveMapper;
import com.gmall.user.mapper.UserMapper;
import com.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveMapper addressMapper;

    public List<UmsMember> queryUser(){
//       return userMapper.queryMember();
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> queryAddressById(String memberId) {
//        UmsMemberReceiveAddress  address = new UmsMemberReceiveAddress();
//        address.setMemberId(memberId);
//        System.out.println(address.toString());

        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> list = addressMapper.selectByExample(example);
        return list;
    }


}
