package lk.ac.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class post_graduate extends Person {
	@Id
	private String id;
	private String institute;
	private String research_interest;
	private String second_degree;
	
	@ManyToMany
	@JoinTable(name="post_graduate_sessions",
	           joinColumns = @JoinColumn(name="post_graduates_id"),
	           inverseJoinColumns =   @JoinColumn(name="sessions_id"))
    private List<session> sessions;
}
