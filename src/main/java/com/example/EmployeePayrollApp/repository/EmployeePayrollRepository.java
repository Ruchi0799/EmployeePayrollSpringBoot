package com.example.EmployeePayrollApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeePayrollApp.model.EmployeePayrollData;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData,Integer> {

	//@Query(value=" ")
}
