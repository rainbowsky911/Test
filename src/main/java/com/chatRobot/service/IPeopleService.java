package com.chatRobot.service;

import com.chatRobot.model.people;

import java.util.List;

public interface IPeopleService {

    List<people> selAll();

    people selectPeople(long id);

    public boolean delete(int id);
}
