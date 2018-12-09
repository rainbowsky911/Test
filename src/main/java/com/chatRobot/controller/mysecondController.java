package com.chatRobot.controller;



import com.chatRobot.model.people;
import com.chatRobot.service.IPeopleService;
import com.chatRobot.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

import java.util.List;

@Controller
@RequestMapping("/heyjude")
public class mysecondController {
    @Resource
    private IUserService userService;

    @Autowired
    private IPeopleService peopleService;



    @RequestMapping("/weare.do")
    public  String test(){
        return "success";
    }
    @RequestMapping("/ModelAndView.do")
    public ModelAndView testModelAndView(){
        ModelAndView mv =new ModelAndView("message");
        people people2 =new people();
        people2.setGender("1");
        people2.setId("1");
        people2.setName("zoro");
        mv.addObject("people",people2);
        return mv;
    }

   @RequestMapping("/showPeople.do")
    public ModelAndView showUsers() {
        ModelAndView mv=null;
        try {
            mv = new ModelAndView("showPeople");
            List<people> peopleList=peopleService.selAll();
            mv.addObject("data",peopleList);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mv;
    }
    @RequestMapping("/deletePeople")
    public ModelAndView deleteUser(int id) {
        if(peopleService.delete(id)) {
            return showUsers();
        }else {
            ModelAndView mv =new ModelAndView("error");
            return mv;
        }
    }


}
