package com.huimiao.lookup;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class User1 {
	private String name ="hui";
	private String sex ="b";

	@Value("this is the place.")
	private String place;


	public User1(){

	}

	public User1(String d){

	}
}
