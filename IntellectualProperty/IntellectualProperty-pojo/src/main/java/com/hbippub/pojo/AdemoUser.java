package com.hbippub.pojo;

public class AdemoUser {
	private String name;
	private int ID;
	private int age;
	private String nickName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "AdemoUser [name=" + name + ", ID=" + ID + ", age=" + age
				+ ", nickName=" + nickName + "]";
	}

}
