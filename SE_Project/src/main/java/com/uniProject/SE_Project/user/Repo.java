package com.uniProject.SE_Project.user;

import com.uniProject.SE_Project.user.UsersModel;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Component
public class Repo{
	private final List<UsersModel> userTable;
	public Repo() {
		this.userTable=new ArrayList<>();
		
	}
	public boolean existById(int id) {
		for(UsersModel userDb : userTable) {
			if(userDb.getId()==id) {
				return true;
			}
		}
		return false;
	}
	public void add(UsersModel usermodels) {
		userTable.add(usermodels);
	}
	public UsersModel findById(int id) {
		for(UsersModel userDb:userTable) {
			if(userDb.getId()==id) {
				return userDb;
			}
		}
		return null;
	}
}