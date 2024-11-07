package com.javaex.ex01;

public class Member {

	private String Id;
	private String name;
	private int point;
	
	public Member() {
		
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {

		return name;
	}

	public void setPoint(int point) {

		this.point = point;
	}

	public int getPoint() {

		return point;
	}

	public void setId(String Id) {

		this.Id = Id;
	}

	public String getId() {

		return Id;
	}

	public void showInfo() {

		System.out.println("회원정보: " + name + "(" + Id + "), " + point + "점");
	}

}
