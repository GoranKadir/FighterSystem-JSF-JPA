package entities;


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
	
	@OneToMany(mappedBy="fighter")
	private List<Match> matches;
	
	
	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

	public int wins(){
		int result = 0;
		for(Match m : matches){
			if(m.getResult() == true){
				result++;
			}
		}
		return result;
	}
	
	public int loses(){
		int loses = 0;
		for(Match m : matches){
			if(m.getResult() == false){
				loses++;
			}
		}
		return loses;
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
	
}
