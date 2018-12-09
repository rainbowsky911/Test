package com.chatRobot.dao;

import com.chatRobot.model.User;
import com.chatRobot.model.people;

import java.util.List;

public interface PeopleDao {
    List<people>selAll();

    people selectPeople(long id);

    public boolean delete(int id);
}
