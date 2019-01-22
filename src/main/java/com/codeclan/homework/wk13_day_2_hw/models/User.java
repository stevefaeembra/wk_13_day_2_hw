package com.codeclan.homework.wk13_day_2_hw.models;

import java.util.List;

public class User {

	private Long id;

	private String name;
	private List<Folder> folders;

	public User(String name, List<Folder> folders) {
		this.name = name;
		this.folders = folders;
	}

	public User() {};

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Folder> getFolders() {
		return folders;
	}

	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}
}
