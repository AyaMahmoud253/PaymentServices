package com.uniProject.SE_Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uniProject.SE_Project.UsersModel;
import com.uniProject.SE_Project.Repo;
import payment.credit;

import java.util.ArrayList;
import java.util.List;

@Service
public class logic {
    @Autowired

    private Repo UserRepository;
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
    public UsersModel getuser(Integer id) {
    
    	return UserRepository.findById(id).get();
    }
    public void addTowallet(double added, credit p){
        double l=(p.getLimit())-(added);
        p.setLimit(l);
        double amount =u.getWalletAmount() +added ;
        u.setWalletAmount(amount);
    }
}
