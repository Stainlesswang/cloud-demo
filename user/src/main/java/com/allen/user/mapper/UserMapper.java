package com.allen.user.mapper;


import org.apache.ibatis.annotations.Param;

/**
 * @author AllenWong
 * @date 2020/5/1 8:12 PM
 */
public interface UserMapper {

    Integer updateMoney(@Param("id") int id, @Param("money")long money);

    Long getMoney(int id);

}
