package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Login> tsl = new TreeSet<Login>(new UNameCompare());
		
		tsl.add(new Login("Vijay","welcome"));
		tsl.add(new Login("Navis","123"));
		tsl.add(new Login("Vijay", "welcomecome"));
		tsl.add(new Login("Anu", "welcome123"));
		
		for(Login l: tsl) {
			System.out.println(l);
		}
		
	}

}

class UNameCompare implements Comparator<Login> {

	@Override
	public int compare(Login l1, Login l2) {
		// TODO Auto-generated method stub
		return l1.getUsername().compareTo(l2.getUsername());
		//this we can update with getPassword
	}
	
}

class Login {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}
	
}