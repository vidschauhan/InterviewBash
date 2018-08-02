package com.example.misc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.RandomAccess;

public class InstanceOFExample {

	public static void main(String[] args) {
		List list = new ArrayList();
		LinkedHashMap ll = new LinkedHashMap();
		
		System.out.println(list instanceof Serializable);
		System.out.println(ll instanceof RandomAccess);
	}

}
