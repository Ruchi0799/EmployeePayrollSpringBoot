package com.example.EmployeePayrollApp.services;

import java.util.List;

import com.example.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.example.EmployeePayrollApp.model.EmployeePayrollData;

public interface IEmployeePayrollService {
 List<EmployeePayrollData> getEmployeePayrollData();
 EmployeePayrollData getEmployeePayrollDataNyId(int empId);
 EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);
 List<EmployeePayrollData> getEmployeeByDepartment(String department);
 EmployeePayrollData updatedEmployeePayrollData(int empId,EmployeePayrollDTO empPayrollDTO);
 void deleteEmployeePayrollData(int empId);
}
