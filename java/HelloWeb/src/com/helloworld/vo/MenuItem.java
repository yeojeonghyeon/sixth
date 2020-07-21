package com.helloworld.vo;

public class MenuItem {
	private String id;
	private String pid;
	private String name;
	public MenuItem(String id, String pid, String name) {
		this.id = id;
		this.pid = pid;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public String getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
}
