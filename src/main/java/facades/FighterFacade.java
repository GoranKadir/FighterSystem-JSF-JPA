package facades;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entities.Fighter;

@Stateless
@DeclareRoles({"admin", "users"})
public class FighterFacade extends AbstractFacade<Fighter> {
	@PersistenceContext(unitName="fightersinfo")
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public FighterFacade() {
		super(Fighter.class);
	}
	
	@Override
	@RolesAllowed({"admin"})
	public void create(Fighter entity) {
		// TODO Auto-generated method stub
		super.create(entity);
	}

	@Override
	@RolesAllowed({"admin"})
	public void edit(Fighter entity) {
		// TODO Auto-generated method stub
		super.edit(entity);
	}

	@Override
	@RolesAllowed({"admin"})
	public void remove(Fighter entity) {
		// TODO Auto-generated method stub
		super.remove(entity);
	}
}
