package com.example.overridingConcepts;

import java.util.HashMap;
import java.util.Map;

import com.example.coreJava.DeepCopy;

public class Alpha extends DeepCopy {
	public int x =10;

	protected void show() {
		System.out.println("This is Alpha Implementation");
		Map map = new HashMap();
		map.put(null, "Vidit"); // can contains one null key and multiple null values.
		map.put(null, "as"); // why only one null keys?? because hashmap contains only unique keys, and null
								// is replaced by new null key.
		
		map.entrySet().forEach(System.out::println);
		
		//Even if display is made protected, it is accessed outside the package.
		display();
		
	}
}
