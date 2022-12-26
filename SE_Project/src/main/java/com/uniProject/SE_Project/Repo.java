package com.uniProject.SE_Project;

import com.uniProject.SE_Project.UsersModel;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<UsersModel, Integer> {
}
