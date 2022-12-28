package com.uniProject.SE_Project.user;

import com.uniProject.SE_Project.user.UsersModel;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<UsersModel, Integer> {
}
