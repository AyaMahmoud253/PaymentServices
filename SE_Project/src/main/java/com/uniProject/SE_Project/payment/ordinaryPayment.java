package com.uniProject.SE_Project.payment;
import com.uniProject.SE_Project.user.UsersModel;
import org.springframework.stereotype.Service;

@Service
public interface ordinaryPayment {

	abstract public String Pay(PayEntity obj);
}
