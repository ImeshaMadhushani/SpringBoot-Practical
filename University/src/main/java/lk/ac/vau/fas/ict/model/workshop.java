package lk.ac.vau.fas.ict.model;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class workshop {
    @Id
	private String id;
	private String description;
	private Date end_date;
	private String name;
	private Date start_date;
	
}
