package com.parmesh.dto;
//Create these simple classes with fields and Lombok's @Data annotation
//e.g., src/main/java/com/example/demo/dto/AuthRequest.java

import lombok.Data;

@Data
public class AuthRequest {
 private String email; // username use when using username/password authentication
 private String password;
public String getEmail() {
	return email;
}
public void SetEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
 
}
