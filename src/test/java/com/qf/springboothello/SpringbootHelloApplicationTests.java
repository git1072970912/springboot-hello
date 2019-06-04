package com.qf.springboothello;

import com.qf.springboothello.dao.UserDao;
import com.qf.springboothello.entity.User;
import com.qf.springboothello.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHelloApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }

    @Test
    public void jpaTest(){
        User user = new User();
        user.setName("zhangzhang");
        user.setPassword("777");
        userDao.save(user);
    }

}
