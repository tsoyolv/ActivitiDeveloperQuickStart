package com.olts.registration.api.mapper;


import com.olts.registration.api.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

/**
 * o.tsoy
 * 23.03.2017
 */
public interface UserMapper {

    User selectUser(int id);

    Collection<User> selectUsers();

    void insertUser(User user);

    // todo move to xml
    @Update("UPDATE user SET name=#{userName}, district =#{district} WHERE id =#{vid}")
    void updateUser(User user);

    void deleteUser(int id);
}
