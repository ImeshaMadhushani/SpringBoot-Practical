package lk.ac.vau.fas.ict.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
       private String email;
       private String gender;
       private String name;
       private int phone;
       
}
