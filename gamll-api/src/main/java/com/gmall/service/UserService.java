package com.gmall.service;


import com.gmall.bean.UmsMember;
import com.gmall.bean.UmsMemberReceiveAddress;


import java.util.List;

public interface UserService {

    public List<UmsMember> queryUser();

    List<UmsMemberReceiveAddress> queryAddressById(String memberId);


}
