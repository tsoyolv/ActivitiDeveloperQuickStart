package com.olts.registration.controller;

import com.olts.registration.api.dao.UserDao;
import com.olts.registration.api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * o.tsoy
 * 30.03.2017
 */
@Controller
public class UserController {

    @Autowired @Qualifier("userDao")
    private UserDao userDao;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") int id, ModelMap model) {
        final User user = userDao.get(id);
        model.addAttribute("user", user);
        return "user";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String showRegistered(ModelMap model) {
        model.addAttribute("users", userDao.get());
        return "show-registers";
    }

    @RequestMapping(value = "/user/create", method = RequestMethod.GET)
    public String retrieveCreationPage(ModelMap model) {
        model.addAttribute("user", new User());
        return "new-user";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String create(User user, ModelMap model) {
        userDao.create(user);
        model.addAttribute("user", user);
        return "user";
    }
}
