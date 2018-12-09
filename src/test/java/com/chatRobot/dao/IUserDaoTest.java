package com.chatRobot.dao;

import com.chatRobot.model.User;
import com.chatRobot.model.people;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private IUserDao dao;

    @Autowired
    private PeopleDao dao2;

    @Test
    public void testSelectUser() throws Exception {
        long id = 1;
        User user = dao.selectUser(id);
        System.out.println(user.getUsername());
    }
    @Test
    public  void testSelectPeople(){
        List<people> list= dao2.selAll();
        people people2=dao2.selectPeople(2);
        System.out.println(people2);
        System.out.println(list);
    }

}