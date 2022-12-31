package com.uniProject.SE_Project.cost;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import com.uniProject.SE_Project.Services.*;
import com.uniProject.SE_Project.user.Repo;
import com.uniProject.SE_Project.user.UsersModel;

public class CostModel {
  ServicesModel s=new ServicesModel();
  CostModel(Long id)
  {
	  this.s.setId(id);
  }
  public Long getServiceId()
  {
	  return s.getId();
  }
}
