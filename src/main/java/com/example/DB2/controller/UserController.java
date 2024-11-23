package com.example.DB2.controller;

import com.example.DB2.DAO.UserDAO;
import com.example.DB2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//controls the user objects
@Controller
public class UserController {
    @Autowired
    UserDAO userdao;

    @RequestMapping("index") //request from the form of index.jsp
    public String user(){
        return "index";
    }

    @RequestMapping("addUser")
    public String AddUser(User user){
        userdao.save(user);
        return "index";
    }
}
