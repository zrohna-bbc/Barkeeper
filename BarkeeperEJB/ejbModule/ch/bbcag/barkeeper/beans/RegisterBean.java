package ch.bbcag.barkeeper.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ch.bbcag.barkeeper.model.User;

/**
 * Session Bean implementation class RegisterBean
 */
@Stateless
@LocalBean
public class RegisterBean implements RegisterBeanLocal {
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean login(String email, String password) {
		return em.createNamedQuery(
				"User.findByEmailAndPassword")
		        .setParameter("email", email)
		        .setParameter("password", password)
		        .getResultList().size() > 0;
	}

	@Override
	public void register(User user) {
		try {
			em.persist(user);
		} catch (Exception e) {
			//handle the exception :D
		}
	}

}
