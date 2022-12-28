package com.uniProject.SE_Project.payment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import com.uniProject.SE_Project.user.UsersModel;
import org.apache.catalina.User;

@Entity
public class PayEntity {
    @Id
     int  transactionID;
     double Amount ;

    public PayEntity() {
    }

    public PayEntity(int transactionID, double amount) {
        this.transactionID = transactionID;
        this.Amount=amount;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }
}
