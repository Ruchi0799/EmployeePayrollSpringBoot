package com.example.EmployeePayrollApp.dto;

import lombok.Data;

public @Data class ResponseDTO {
	
private String message;
private Object data;

public ResponseDTO(String message, Object data) {
	this.setMessage(message);
	this.setData(data);
}

//public Object getData() {
//	return data;
//}
//
//public void setData(Object data) {
//	this.data = data;
//}
//
//public String getMessage() {
//	return message;
//}
//
//public void setMessage(String message) {
//	this.message = message;
//}
}
