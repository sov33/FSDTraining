package com.ibm.fsd.capsule.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ibm.fsd.capsule.backend.base.AuditModel;

@Entity
@Table(name="skill")
public class Skill extends AuditModel {

	private static final long serialVersionUID = 1L;

	@Id
	@org.springframework.data.annotation.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="toc", nullable = false)
	private String toc;
	
	@Column(name="prerequisites", nullable = false)
	private String prerequisites;

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

	public String getToc() {
		return toc;
	}

	public void setToc(String toc) {
		this.toc = toc;
	}

	public String getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", toc=" + toc + ", prerequisites=" + prerequisites + "]";
	}
	

}
