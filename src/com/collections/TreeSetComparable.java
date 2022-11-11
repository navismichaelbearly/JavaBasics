package com.collections;

import java.util.TreeSet;

public class TreeSetComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		JavaBeans jb = new JavaBeans("Vijay", 35);
//		System.out.println(jb.getName());
//		jb.setAge(40);
//		System.out.println(jb.getAge());
		
		
		TreeSet<User> tsu = new TreeSet<User>();
		tsu.add(new User("Vijay"));
		tsu.add(new User("Navis"));
		tsu.add(new User("Vijay"));
		tsu.add(new User("Anu"));
		
		for(User u: tsu) {
			System.out.println(u);
		}

	}

}

class User implements Comparable<User> {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User(String username) {
		super();
		this.username = username;
	}

	@Override
	public int compareTo(User u) {
		// TODO Auto-generated method stub
		return this.username.compareTo(u.username);
	}

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}
	
}


