package com.example.Student.controller;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.model.Student;

	@RestController
	@RequestMapping("/app")
	public class AppController {
		//create some student object
		Student Bob = new Student("2020ICT120","Bob Marely",25,"IT",3.2);
		Student Steve = new Student("2020ICT122","Steve Smith",24,"IT",3.5);
		Student Joe = new Student("2020ICT124","Joe Root",25,"IT",3.7);
		Student Virat = new Student("2020ICT126","Virat Kholi",23,"IT",3.1);
		Student David = new Student("2020ICT128","David Warner",22,"IT",3.2);
		
		List<Student> students = new ArrayList<Student>();

		public AppController() {
			students.add(Bob);
			students.add(Steve);
			students.add(Joe);
			students.add(Virat);
			students.add(David);
		}
		@GetMapping("/msg")
		public String myMessage() {
			return "Hello SpringBoot";
		}
		
		@GetMapping("/name")
		public String myName() {
			return "Hello my name is SpringBoot";
		}
		
		@GetMapping("age/{ag}")
		public String MyAge(@PathVariable("ag") int age) {
			return "My age is "+age;
		}
		
		@GetMapping("name/{name}")
		public String MyName(@PathVariable("name") String name) {
			return "My name is "+name;
		}
		
		//a method to return a student
		@GetMapping("/student")
		public Student getStudent() {
			return Bob;
		}
		
		//a method to return multiple student
		@GetMapping("/students")
		public List<Student> getAllStudent() {
			students.add(Bob);
			students.add(Steve);
			students.add(Joe);
			students.add(Virat);
			students.add(David);
			return students;
		}
		
		//find a student from the list by reg_no
		@GetMapping("student/{id}")
		public Student getStudent(@PathVariable("id") String regno) {
			for (Student student:students) {
				if(student.getRegNo().equals(regno)) {
					return student;
				}
			}
			return null;
		}
		
		//find the students whose age is between 20 and 23
		@GetMapping("/age-range")
		public List<Student> getStudentByAge() {
		    List<Student> result = new ArrayList<>();
		    for (Student student : students) {
		        if (student.getAge() >= 20 && student.getAge() <= 23) {
		            result.add(student);
		        }
		    }
		   return result; 

		}
		
		//sort the student by their gpa
		@GetMapping("/sorted-gpa")
		public List<Student> getStuByGPA(){
		    List<Student> sortedList = new ArrayList<>(students);
		    sortedList.sort((bob,alice)->Double.compare(alice.getGpa(), bob.getGpa()));
		    return sortedList;
		}

		//create CURD operations for students
		@PostMapping("/add")
		public Student addStudent(@RequestBody Student student){
		    students.add(student);
		    return student;
		}
		
		@PutMapping("/update/{id}")
	    public Student updateStudent(@PathVariable("id") String regNo, @RequestBody Student updatedStudent) {
	        for (int i = 0; i < students.size(); i++) {
	            if (students.get(i).getRegNo).equals(regNo)) {
	                students.set(i, updatedStudent);
	                return updatedStudent;
	            }
	        }
	        return null;
	    }
	    @DeleteMapping("/delete/{id}")
	    public String deleteStudent(@PathVariable("id") String regNo) {
	        students.removeIf(student -> student.getRegNo).equals(regNo));
	        return "Student with ID " + regNo + " deleted successfully.";
	    }
	}

		
		
