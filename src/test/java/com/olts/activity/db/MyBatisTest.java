package com.olts.activity.db;

import com.olts.activity.api.SubscriberMapper;
import com.olts.activity.api.entities.Subscriber;
import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * o.tsoy
 * 23.03.2017
 */
public class MyBatisTest extends TestCase {

    @Test
    public void testConnect() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            SubscriberMapper mapper = session.getMapper(SubscriberMapper.class);
            Subscriber subscriber = mapper.selectSubscriber(1);
            assertTrue(subscriber != null);
            System.out.println(subscriber);
        } finally {
            session.close();
        }
    }
}
