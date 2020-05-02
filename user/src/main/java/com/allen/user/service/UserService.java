package com.allen.user.service;

import com.allen.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author AllenWong
 * @date 2020/5/1 8:19 PM
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;


    public boolean isEnough(Integer id,Long useMoney){
        Long now=userMapper.getMoney(id);

        return now != null && now > useMoney;
    }

    public boolean useMoney(Integer id,Long useMoney){
        Integer now=userMapper.updateMoney(id,useMoney);

        return now != null && now > 0;
    }

}
