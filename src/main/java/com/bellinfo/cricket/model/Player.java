package com.bellinfo.cricket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private int age;
	private String specialization;
	private long centuries;
	private long totalruns;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public long getCenturies() {
		return centuries;
	}
	public void setCenturies(long centuries) {
		this.centuries = centuries;
	}
	public long getTotalruns() {
		return totalruns;
	}
	public void setTotalruns(long totalruns) {
		this.totalruns = totalruns;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", specialization=" + specialization
				+ ", centuries=" + centuries + ", totalruns=" + totalruns + "]";
	}

}
