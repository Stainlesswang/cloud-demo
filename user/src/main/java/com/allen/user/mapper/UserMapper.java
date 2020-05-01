package com.allen.user.mapper;



/**
 * @author AllenWong
 * @date 2020/5/1 8:12 PM
 */
public interface UserMapper {

    Integer updateMoney(int id,long money);

    Long getMoney(int id);

}
