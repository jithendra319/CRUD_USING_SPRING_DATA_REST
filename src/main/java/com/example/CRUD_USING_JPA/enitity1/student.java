package com.example.CRUD_USING_JPA.enitity1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
public class student {
	@Id
	@GeneratedValue
	private int rno;
	private String name;
	private String dep;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "student [rno=" + rno + ", name=" + name + ", dep=" + dep + "]";
	}
	
	
}
