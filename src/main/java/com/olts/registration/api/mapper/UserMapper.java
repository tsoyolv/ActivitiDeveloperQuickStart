package com.olts.registration.api.mapper;


import com.olts.registration.api.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

/**
 * o.tsoy
 * 23.03.2017
 */
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "secondName", column = "second_name"),
            @Result(property = "lastName", column = "last_name")
    })
    User selectUser(int id);

    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "secondName", column = "second_name"),
            @Result(property = "lastName", column = "last_name")
    })
    Collection<User> selectUsers();

    @Insert("INSERT into user(id, login, password, first_name, second_name, last_name, age)" +
            " VALUES(#{id}, #{login}, #{password}, #{firstName}, #{secondName}, #{lastName}, #{age})")
    void insertUser(User user);

    @Update("UPDATE user SET name=#{userName}, district =#{district} WHERE id =#{vid}")
    void updateUser(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void deleteUser(int id);
}
