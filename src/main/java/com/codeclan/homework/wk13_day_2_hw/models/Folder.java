package com.codeclan.homework.wk13_day_2_hw.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="folders")
public class Folder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="title")
	private String title;

	@JsonIgnore
	@OneToMany(mappedBy="inFolder")
	private List<File> files;

	@ManyToOne
	@JoinColumn(name="user_id", nullable=false)
	private User owner;

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
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<File> getFiles() {
		return this.files;
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
