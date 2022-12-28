package com.uniProject.SE_Project.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.TypeCollector;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uniProject.SE_Project.user.UsersModel;
import com.uniProject.SE_Project.user.logic;
import com.uniProject.SE_Project.user.Repo;

import java.util.List;
import java.util.Objects;

@RestController
public class controller {
    @Autowired
    private logic getservice;
    Response R=new Response();


    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public List<UsersModel> getAllUser()
    {
        return getservice.getAlUsers();
    }


    @RequestMapping(value = "/sign-up", method = RequestMethod.POST)
    public void addUser(@RequestBody UsersModel userRecord)
    {
        getservice.signIn(userRecord);
        
    }
    @RequestMapping(value = "/get-user/{id}", method = RequestMethod.GET)
    public UsersModel getUser(@PathVariable ("id") int id)
    {
        return getservice.getuser(id);

    }


    @RequestMapping(value = "/Admin/sign-in", method = RequestMethod.POST)
    public String addUser(@RequestBody Admin userRecord)
    {
        if(Objects.equals(userRecord.name, "admin")&&Objects.equals(userRecord.email, "admin12@gmail.com")&&
                Objects.equals(userRecord.id, 122)) {
            getservice.Admin_signIn(userRecord);
            R.setMessage("Admin Account");
            return R.getMessage();
        }
        else
            return getservice.checkAdmin();

    }

}

