package com.olts.registration.api.dao;

import com.olts.registration.api.entity.User;
import org.junit.Test;

import java.util.Collection;

/**
 * o.tsoy
 * 24.03.2017
 */
public class UserDaoImplTest {
    @Test
    public void get() throws Exception {

    }

    @Test
    public void get1() throws Exception {
        UserDao userDao = new UserDaoImpl();
        Collection<User> users = userDao.get();
        System.out.println(users);
    }

    @Test
    public void create() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

}