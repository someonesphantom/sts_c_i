package com.example.demo.summerInterns;


import org.springframework.data.annotation.Id;

import lombok.Data;
@Data
public class interns {
	
	@Id
	public String _id;
	private String FirstName;
	private String LastName;
	private String StudentNumber;
	

}
