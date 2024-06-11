package CRUD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {

	@Id
	int roll;
	String name;
	String achivement;
	int age;
	
	public student() {
		super();
	}
	
	
	public student(int roll, String name, String achivement, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.achivement = achivement;
		this.age = age;
	}
	
	
	public student(String name, String achivement, int age) {
		super();
		this.name = name;
		this.achivement = achivement;
		this.age = age;
	}


	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAchivement() {
		return achivement;
	}
	public void setAchivement(String achivement) {
		this.achivement = achivement;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student_data [roll=" + roll + ", name=" + name + ", achivement=" + achivement + ", age=" + age + "]";
	}
	
	
	
	
}
