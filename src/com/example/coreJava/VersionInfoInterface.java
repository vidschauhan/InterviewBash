package com.example.coreJava;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public interface VersionInfoInterface {
	String VERSION = getVersion();
	String IMP_TITLE = getImpTitle();

	public class Version extends TimerTask {
		Date now; // to display current time
		Timer time = new Timer(); 
		public Version() {
			time.schedule(this, 0, 1000);
		}
		@Override
		public void run() {
			now = new Date(); // initialize date
			System.out.println("Time is :" + now); // Display current time	
			System.out.println("Implementation Title = {} & Implementation Version = {}" + IMP_TITLE + VERSION);
		}
			
		
	}
	static String getVersion() {
		return "Vidit";
	}

	static String getImpTitle() {
		return "Singh";
	}
}
