package com.codeclan.homework.wk13_day_2_hw.models;

import java.util.ArrayList;
import java.util.List;

public class Folder {

	private String title;
	private List<File> files;
	private User owner;
	private Long id;

	public Folder(String title, User owner) {
		this.title = title;
		this.owner = owner;
		this.files = new ArrayList<>();
	}

	public Folder() {};


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
}