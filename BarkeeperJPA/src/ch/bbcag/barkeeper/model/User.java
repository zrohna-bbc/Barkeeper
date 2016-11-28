package ch.bbcag.barkeeper.model;

import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * Entity implementation class for Entity: User
 *
 */
@Named
@Entity
@NamedQuery(name="User.findByEmailAndPassword", query="SELECT user FROM User user WHERE user.email = :email AND user.password = :password")
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String userName;
	private String email;
	private String password;
	private Date birthdate;
	private Date joindate;
	private String phone;
	private int likes;
	private int posts;
	private int comments;
	private boolean publicProfile;
	
	public User(String username, String email, String phone, String password, String birthdate){
		setUserName(username);
		setEmail(email);
		setPhone(phone);
		try {setBirthdate(new Date(new SimpleDateFormat("yyyy-MM-dd").parse(birthdate).getTime()));}catch(ParseException e){}
		setPassword(password);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getPosts() {
		return posts;
	}

	public void setPosts(int posts) {
		this.posts = posts;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public boolean isPublicProfile() {
		return publicProfile;
	}

	public void setPublicProfile(boolean publicProfile) {
		this.publicProfile = publicProfile;
	}
	public User() {
		super();
	}
}
