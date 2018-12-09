package com.chatRobot.service.impl;

import com.chatRobot.dao.PeopleDao;
import com.chatRobot.model.people;
import com.chatRobot.service.IPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


import java.util.List;
@Service(value = "peopleService")
public class PeopleServiceImpl implements IPeopleService {

    @Autowired
    private PeopleDao dao;

    public List<people> selAll() {
        return dao.selAll();
    }

    @Override
    public people selectPeople(long id) {
        return dao.selectPeople(id);
    }

    @Override
    public boolean delete(int id) {
        return dao.delete(id);
    }


}
