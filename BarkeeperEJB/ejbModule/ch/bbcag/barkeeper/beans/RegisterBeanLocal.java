package ch.bbcag.barkeeper.beans;

import javax.ejb.Local;

import ch.bbcag.barkeeper.model.User;

@Local
public interface RegisterBeanLocal {
	public void register(User user);
	public boolean login(String email, String password);
}
