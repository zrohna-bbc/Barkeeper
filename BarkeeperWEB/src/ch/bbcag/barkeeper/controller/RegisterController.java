package ch.bbcag.barkeeper.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ch.bbcag.barkeeper.beans.RegisterBeanLocal;
import ch.bbcag.barkeeper.model.User;

@Named
@SessionScoped
public class RegisterController implements Serializable {
	private static final long serialVersionUID = 2851335659610577310L;

	@EJB
	private RegisterBeanLocal registerBean;
	
	@Inject
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String register(String username, String email, String phone, String birthdate, String password) {
		try {
			registerBean.register(new User(username, email, phone, password, birthdate));
			System.out.println("Customer has been registered c:");
		} catch (Exception e) {
			System.out.println("Customer could not be registered :c");
		}
		return "/home";

	}

	public String login() {
		try {
			if (registerBean.login(getUser().getEmail(), getUser().getPassword())) {
				System.out.println("Customer " + getUser().getEmail() + " has been logged in");
			} else {
				System.out.println("Customer could not be logged in");
			}
		} catch (Exception e) {
			System.out.println("Exception while logging in Customer:");
			e.printStackTrace();
		}
		return "";
	}
}
