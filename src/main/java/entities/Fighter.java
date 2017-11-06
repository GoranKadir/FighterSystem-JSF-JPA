package entities;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.primefaces.event.RateEvent;


@Entity
public class Fighter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "fullname")
	private String name;
	
	@Column
	private String gym;

	@Column
	private int rating;
	
	@OneToMany(mappedBy="winner")
	private List<Match> winMatches;
	
	@OneToMany(mappedBy="loser")
	private List<Match> lossMatches;
		
	
	public int getWins(){
		
		return winMatches.size();
	}
	
	public int getLoses(){
		return lossMatches.size();
	}
	
	public Fighter(){}
	public Fighter(String name, String gym, int rating) {
		this.name = name;
		this.gym = gym;
		this.rating = rating;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGym() {
		return gym;
	}

	public void setGym(String gym) {
		this.gym = gym;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	public List<Match> getMatches() {
		List<Match> addMatch = new ArrayList<Match>(winMatches);
		addMatch.addAll(lossMatches);
		return addMatch;
	}
	
	@Override
	public boolean equals(Object other) {
	    return (other instanceof Fighter) && (id != 0)
	        ? id == (((Fighter) other).id)
	        : (other == this);
	}

	@Override
	public int hashCode() {
	    return (id != 0)
	        ? (this.getClass().hashCode() + id)
	        : super.hashCode();
	}

}
