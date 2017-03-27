package com.olts.registration.api.dao;

import com.olts.registration.api.GlobalIdGenerator;
import com.olts.registration.api.entity.User;
import com.olts.registration.api.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

/**
 * o.tsoy
 * 23.03.2017
 */
public class UserDaoImpl implements UserDao {

    public User get(int id) {
        SqlSession sqlSession = retrieveSession();
        User user = sqlSession.getMapper(UserMapper.class).selectUser(id);
        sqlSession.close();
        return user;
    }

    public Collection<User> get() {
        SqlSession sqlSession = retrieveSession();
        Collection<User> users = sqlSession.getMapper(UserMapper.class).selectUsers();
        sqlSession.close();
        return users;
    }

    public User create(User template) {
        SqlSession sqlSession = retrieveSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        template.setId(GlobalIdGenerator.generateId());
        mapper.insertUser(template);
        sqlSession.commit();
        sqlSession.close();
        return template;
    }

    public User update(User template) {
        SqlSession sqlSession = retrieveSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(template);
        sqlSession.commit();
        sqlSession.close();
        return template;
    }

    public void delete(int id) {
        SqlSession sqlSession = retrieveSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(id);
        sqlSession.commit();
        sqlSession.close();
    }

    private SqlSession retrieveSession() {
        String resource = "registration/registration-mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            // todo use some exceptionMapper or use own
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }
}
