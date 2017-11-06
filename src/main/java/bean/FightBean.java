package bean;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import entities.Fighter;
import entities.Match;
import facades.FighterFacade;
import facades.MatchFacade;

@Named
@ViewScoped
public class FightBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private FighterFacade fighterEJB;
	@EJB
	private MatchFacade matchEJB;
	
	private List<Fighter> fighters;
	private List<Match> matches;
	private Fighter selectedFighter;

	public List<Fighter> getFighters() {
		if(fighters == null){
			fighters = fighterEJB.findAll();
		}
		return fighters;
	}
	public List<Match> getMatches() {
		if(matches == null){
			matches = matchEJB.findAll();
		}
		return matches;
	}
	
	public void addFighter(){
		Fighter f = new Fighter("", "", 0);
		fighterEJB.create(f);
		fighters.add(f);
	}
	
	public void removeFighter(Fighter f){
		fighterEJB.remove(f);
		fighters.remove(f);
	}
	
	public void saveFighter(Fighter f){
		fighterEJB.edit(f);
	}
	
	public void setFighters(List<Fighter> fighters) {
		this.fighters = fighters;
	}
	
	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}
	
	public FighterFacade getFighterEJB() {
		return fighterEJB;
	}
	public void setFighterEJB(FighterFacade fighterEJB) {
		this.fighterEJB = fighterEJB;
	}
	public Fighter getSelectedFighter() {
		return selectedFighter;
	}
	public void setSelectedFighter(Fighter selectedFighter) {
		this.selectedFighter = selectedFighter;
	}
}

