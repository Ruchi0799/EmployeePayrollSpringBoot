package com.example.EmployeePayrollApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.example.EmployeePayrollApp.exceptions.EmployeePayrollException;
import com.example.EmployeePayrollApp.model.EmployeePayrollData;
import com.example.EmployeePayrollApp.repository.EmployeePayrollRepository;

import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService {
	
	
	@Autowired
	private EmployeePayrollRepository employeeRepository;
	
	private List<EmployeePayrollData> employeePayrollList=new ArrayList<>();

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		// TODO Auto-generated method stub
		
		return employeeRepository.findAll();
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataNyId(int empId) {
		// TODO Auto-generated method stub
		//EmployeePayrollData employeePayrollData=null;
		return employeeRepository.findById(empId).orElseThrow(()->new EmployeePayrollException("Employee not found"+empId));
		//return employeePayrollList.get(empId-1);
	}
	
	

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		// TODO Auto-generated method stub
		EmployeePayrollData employeePayrollData=null;
		employeePayrollData=new EmployeePayrollData(empPayrollDTO);
		employeePayrollList.add(employeePayrollData);
		log.debug("Emp Data:"+employeePayrollData.toString());
		return employeeRepository.save(employeePayrollData);
	}

	@Override
	public EmployeePayrollData updatedEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
		// TODO Auto-generated method stub
		EmployeePayrollData empData=this.getEmployeePayrollDataNyId(empId);
		empData.updateEmployeePayrollData(empPayrollDTO);
		return employeeRepository.save(empData);
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		// TODO Auto-generated method stub
		EmployeePayrollData empData=this.getEmployeePayrollDataNyId(empId);
		employeeRepository.delete(empData);

	}

}
