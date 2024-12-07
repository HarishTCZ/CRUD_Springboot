package com.example.DB2.controller;

import com.example.DB2.DAO.UserDAO;
import com.example.DB2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//controls the user objects
@Controller
public class UserController {
    @Autowired
    UserDAO userdao; //handles all the interactions with the database

    @RequestMapping("index") //request from the form of index.jsp
    public String user(){
        return "index";
    }

    @RequestMapping("addUser")
    public String AddUser(User user){
        userdao.save(user);
        return "index";
    }

    @RequestMapping("getUser")
    public ModelAndView getUser(@RequestParam int id){
        //requestparam extract input data that may be passed as a query, form data, or any arbitrary custom data
        ModelAndView mav = new ModelAndView("showUser");//handles both model and view object (view name is inside)
        User user = userdao.findById(id).orElse(null); //gets the user object by finding its id
        mav.addObject(user);
        System.out.println(id);
        return mav;
    }

    @RequestMapping("deleteUser")
    public ModelAndView deleteUser(@RequestParam int id){
        //requestparam extract input data that may be passed as a query, form data, or any arbitrary custom data
        ModelAndView mav = new ModelAndView("deleteUser");//handles both model and view object (view name is inside)
        User user = userdao.findById(id).orElse(null); //gets the user object by finding its id
        userdao.deleteById(id);
        mav.addObject(user);
        System.out.println(id);
        return mav;
    }
}
