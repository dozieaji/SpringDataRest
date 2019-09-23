package com.dozie.springDataRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dozie.springDataRest.model.Employee;

@RepositoryRestResource(collectionResourceRel="employee",path="employee")
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
