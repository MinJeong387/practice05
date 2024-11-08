package com.javaex.ex07;

public class FriendExplain {

	private String name;
	private String hp;
	private String school;

	// getter/setter 작성
	public FriendExplain(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}

	// getter/ setter 작성 (굳이 필요 없을 것 같긴 함)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
	// 일반 메서드
	public void showInfo() {
		System.out.println("이름:" + name + "  핸드폰:" + hp + "  학교:" + school);
	}

}
