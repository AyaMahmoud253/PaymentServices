package com.uniProject.SE_Project.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uniProject.SE_Project.payment.credit;


import java.util.ArrayList;
import java.util.List;

@Service
public class logic {
    @Autowired

    private Repo UserRepository;
    @Autowired
    private AdminRepo adminrepo;
    private UsersModel u;
    public List<UsersModel> getAlUsers()
    {

        List<UsersModel> AllUserRecords = new ArrayList<>();
        UserRepository.findAll().forEach(AllUserRecords::add);
        return AllUserRecords;
    }
     
    public void signIn(UsersModel userRecord)
    {
        UserRepository.save(userRecord);
    }
    public void Admin_signIn(Admin userRecord)
    {
        adminrepo.save(userRecord);
    }
    public UsersModel getuser(Integer id) {
    
    	return UserRepository.findById(id).get();
    }
    public void addTowallet(double added, credit p){
        double l=(p.getLimit())-(added);
        p.setLimit(l);
        double amount =u.getWalletAmount() +added ;
        u.setWalletAmount(amount);
    }
    public String checkAdmin(){
        return "Not Admin ";
    }
}
