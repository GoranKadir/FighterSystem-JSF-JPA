package facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entities.Fighter;

@Stateless
public class FighterFacade extends AbstractFacade<Fighter> {
	@PersistenceContext(unitName="fightersinfo")
	private EntityManager em;
	
	public FighterFacade() {
		super(Fighter.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
//	<h:panelGrid columns="2" cellpadding="5">
//	<h:outputText value="vote: " />
//	<h:outputText id="output" value="#{f.rating}" />
//</h:panelGrid>
//
//<p:commandButton value="+" actionListener="#{f.increment}"
//	update="output" />
//<p:commandButton value="-" actionListener="#{f.minus}"
//	update="output"></p:commandButton>



}
