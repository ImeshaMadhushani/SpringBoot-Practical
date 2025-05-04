package lk.ac.vau.fas.ict.model;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class session {
	@Id
	private String id;
	private Date date;
	private String description;
	private String name;
	private Time time;
	private int workshop_id;
	
	@ManyToMany(mappedBy="sessions")
	private List<post_graduate> post_graduates;
	
	@ManyToMany(mappedBy="sessions")
    private List<under_graduate> under_graduates;
	
	@ManyToMany(mappedBy="sessions")
	private List<presenter>presenters;

}
