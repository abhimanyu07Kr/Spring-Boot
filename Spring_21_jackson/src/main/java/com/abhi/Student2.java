package com.abhi;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Student2 {
	
	
	public static void getObjToJson() throws Exception
	{
		Student s1 = new Student("abhi",101,"cse");
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("stu.json"), s1);
		System.out.println("done");
	}
	
	public static void main(String[] args) throws Exception {
		getObjToJson();
		
	}

}
