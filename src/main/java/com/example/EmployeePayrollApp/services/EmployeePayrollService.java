package com.example.EmployeePayrollApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.example.EmployeePayrollApp.model.EmployeePayrollData;



@Service
public class EmployeePayrollService implements IEmployeePayrollService {
	
	private List<EmployeePayrollData> employeePayrollList=new ArrayList<>();

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		// TODO Auto-generated method stub
		
		return employeePayrollList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataNyId(int empId) {
		// TODO Auto-generated method stub
		//EmployeePayrollData employeePayrollData=null;
		return employeePayrollList.get(empId-1);
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		// TODO Auto-generated method stub
		EmployeePayrollData employeePayrollData=null;
		employeePayrollData=new EmployeePayrollData(1,empPayrollDTO);
		employeePayrollList.add(employeePayrollData);
		return employeePayrollData;
	}

	@Override
	public EmployeePayrollData updatedEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
		// TODO Auto-generated method stub
		EmployeePayrollData empData=this.getEmployeePayrollDataNyId(empId);
		empData.setName(empPayrollDTO.name);
		empData.setSalary(empPayrollDTO.salary);
		employeePayrollList.set(empId-1, empData);
		return empData;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		// TODO Auto-generated method stub
		employeePayrollList.remove(empId-1);

	}

}
