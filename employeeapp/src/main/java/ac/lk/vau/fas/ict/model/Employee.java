package ac.lk.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee{
	@Id
	private String empNo;
	private String name;
	private int age;
	private String gender;
	private double salary;
	@ManyToOne
	private Department department; // one - many relationship in employee and department
	
	@ManyToMany(mappedBy="employees")
	private List<Project>projects; //employee has many projects
}
