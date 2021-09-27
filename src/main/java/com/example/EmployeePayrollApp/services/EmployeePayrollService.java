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
		List<EmployeePayrollData> employeePayrollList=new ArrayList<>();
		employeePayrollList.add(new EmployeePayrollData(1,new EmployeePayrollDTO("Pankaj",3000)));
		
		return employeePayrollList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataNyId(int empId) {
		// TODO Auto-generated method stub
		//EmployeePayrollData employeePayrollData=null;
		EmployeePayrollData employeePayrollData=null;
		employeePayrollData=new EmployeePayrollData(1,new EmployeePayrollDTO("Pankaj",3000));
		return employeePayrollData;
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		// TODO Auto-generated method stub
		EmployeePayrollData employeePayrollData=null;
		employeePayrollData=new EmployeePayrollData(3,empPayrollDTO);
		return employeePayrollData;
	}

	@Override
	public EmployeePayrollData updatedEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
		// TODO Auto-generated method stub
		EmployeePayrollData employeePayrollData=null;
		employeePayrollData=new EmployeePayrollData(empId,empPayrollDTO);
		return employeePayrollData;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		// TODO Auto-generated method stub

	}

}
