package com.olts.registration;

import com.olts.registration.api.dao.UserDao;
import com.olts.registration.api.dao.UserDaoImpl;
import com.olts.registration.api.entity.User;

/**
 * o.tsoy
 * 24.03.2017
 */
public class ShowRegisteredUsers {

    public static String show() {
        UserDao userDao = new UserDaoImpl();
        StringBuilder str = new StringBuilder("");
        userDao.get().forEach(user -> str.append("<p class=\"lead\">").append(formattedUserString(user)).append("</p>"));
        return str.toString();
    }

    private static String formattedUserString(User user) {
        return user.getFirstName() + " " + user.getSecondName() + " " + user.getLastName() + " " + user.getAge();
    }
}
