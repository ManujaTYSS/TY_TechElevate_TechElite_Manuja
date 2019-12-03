package com.tyss.talunthunt.dto;

import java.util.List;

import lombok.Data;

@Data
public class Response {

		
		private int statusCode;
		private String message;
		private String clientId;
		private List<AddRequirements> add;
	
		
		
		
		
	}



