package com.spring.rewards.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rewards.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
