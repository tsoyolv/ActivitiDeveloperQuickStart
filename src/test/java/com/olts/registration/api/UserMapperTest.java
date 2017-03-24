package com.olts.registration.api;

import com.olts.registration.api.entity.User;
import com.olts.registration.api.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * o.tsoy
 * 23.03.2017
 */
public class UserMapperTest {
    @Test
    public void selectUser() throws Exception {
        String resource = "registration/registration-mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        System.out.println(mapper.selectUser(1));
    }

    @Test
    public void selectUsers() throws Exception {
        String resource = "registration/registration-mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        System.out.println(mapper.selectUsers());
    }

    @Test
    public void insertUser() throws Exception {
        String resource = "registration/registration-mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User userIvan = new User();
            userIvan.setId(GlobalIdGenerator.generateId());
            userIvan.setLogin("vano");
            userIvan.setPassword("212");
            userIvan.setFirstName("Ivan");
            userIvan.setSecondName("Ivanov");
            userIvan.setLastName("Ivanovich");
            userIvan.setAge(32);

            mapper.insertUser(userIvan);

            System.out.println(userIvan);
            System.out.println(userIvan.equals(mapper.selectUser(userIvan.getId())));
            session.commit();
        } finally {
            session.close();
        }
    }

    @Test
    public void updateUser() throws Exception {

    }

    @Test
    public void deleteUser() throws Exception {

    }

}