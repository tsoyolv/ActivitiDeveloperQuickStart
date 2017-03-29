package com.olts.registration;

import com.olts.registration.api.dao.UserDao;
import com.olts.registration.api.entity.User;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

/**
 * o.tsoy
 * 24.03.2017
 */
public class ShowRegisteredUsers {

    public static String show(ServletContext context) {
        WebApplicationContext webApplicationContext = (WebApplicationContext) context.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        UserDao userDao = webApplicationContext.getBean("userDao", UserDao.class);
        StringBuilder str = new StringBuilder("");
        userDao.get().forEach(user -> str.append("<tr>").append(formattedUserString(user)).append("</tr>"));
        return str.toString();
    }

    private static String formattedUserString(User user) {
        return "<th>" + user.getFirstName() + "</th><th>" + user.getSecondName() + "</th><th>" + user.getLastName() + "</th><th>" + user.getAge() + "</th>";
    }
}
