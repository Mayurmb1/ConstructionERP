package com.mayur.construction;


public class UserData {

	static int pid ;
	static String asigner;
	static String empmail; 
	
	public static String getEmpmail() {
		return empmail;
	}

	public static void setEmpmail(String empmail) {
		UserData.empmail = empmail;
	}

	public static int getPid() {
		return pid;
	}

	public static void setPid(int pid) {
		UserData.pid = pid;
	}

	public static String getAsigner() {
		return asigner;
	}

	public static void setAsigner(String asigner) {
		UserData.asigner = asigner;
	}
	
	

}
