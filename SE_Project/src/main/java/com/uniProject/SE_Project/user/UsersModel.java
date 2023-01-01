package com.uniProject.SE_Project.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import com.uniProject.SE_Project.payment.credit;
@Entity
public class UsersModel {

    private Integer id;
    private String name;
    private String email;
    private double walletAmount ;

    
 
   
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email)
    {
        this.email = email;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    public Integer getId() {
        return id;
    }
    public double getWalletAmount() {
        return walletAmount;
    }

    public void setWalletAmount(double walletAmount) {
        this.walletAmount = walletAmount;
    }


}

