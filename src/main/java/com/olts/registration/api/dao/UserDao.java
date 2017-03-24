package com.olts.registration.api.dao;

import com.olts.registration.api.entity.User;

import java.util.Collection;

/**
 * o.tsoy
 * 23.03.2017
 */
public interface UserDao {

    User get(int id);

    Collection<User> get();

    User create(User template);

    User update(User template);

    void delete(int id);
}
