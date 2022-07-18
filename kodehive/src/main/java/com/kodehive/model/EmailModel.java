package com.kodehive.model;


import java.util.List;

import lombok.Data;

@Data
public class EmailModel {
	
	private int id;
	private String message;
	private List<String> to;
	private List<String> cc;
	private String subject;
}
