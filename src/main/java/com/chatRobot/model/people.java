package com.chatRobot.model;

public class people {
    private  String name;
    private  String id;
    private  String gender;

    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public people() {

    }
}
