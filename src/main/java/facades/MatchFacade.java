package facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Match;

@Stateless
public class MatchFacade extends AbstractFacade<Match> {
	@PersistenceContext(unitName="fightersinfo")
	private EntityManager em;

	public MatchFacade() {
		super(Match.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
