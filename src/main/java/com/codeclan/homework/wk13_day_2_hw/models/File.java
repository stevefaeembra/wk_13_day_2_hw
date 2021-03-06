package com.codeclan.homework.wk13_day_2_hw.models;

import javax.persistence.*;

@Entity
@Table(name="files")
public class File {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="name")
	private String name;

	@Column(name="extension")
	private String extension;

	@Column(name="fileSize")
	private Long fileSize;

	@ManyToOne
	@JoinColumn(name="folder_id", nullable=false)
	private Folder inFolder;

	public File(String name, String extension, Long fileSize, Folder inFolder) {
		this.name = name;
		this.extension = extension;
		this.fileSize = fileSize;
		this.inFolder = inFolder;
	}

	public File() {};

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

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public Folder getInFolder() {
		return inFolder;
	}

	public void setInFolder(Folder inFolder) {
		this.inFolder = inFolder;
	}
}
