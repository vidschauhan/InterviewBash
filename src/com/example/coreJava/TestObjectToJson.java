package com.example.coreJava;

import com.google.gson.Gson;

public class TestObjectToJson {

	private int data1 = 100;
	  private String data2 = "hello";
	  
	public static void main(String[] args) {
		 String data = "hello";
		
		TestObjectToJson obj = new TestObjectToJson();
	     Gson gson = new Gson();
	   //  JSONObject jsonObj = new JSONObject("{\"emailId\":\"N95\",\"cat\":\"WP\"}");
	      //convert java object to JSON format
	      String json = gson.toJson(data);

	      System.out.println(json);

	}

}
