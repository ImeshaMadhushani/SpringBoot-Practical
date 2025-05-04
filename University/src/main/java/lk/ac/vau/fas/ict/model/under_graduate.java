package lk.ac.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class under_graduate extends Person{
    @Id
	private String id;
	private String degree;
	private String university;
	
	@ManyToMany
	@JoinTable(name="under_graduate_sessions ",
	           joinColumns = @JoinColumn(name="under_graduates_id"),
	           inverseJoinColumns = @JoinColumn(name="sessions_id"))
	private List<session> sessions;
}
