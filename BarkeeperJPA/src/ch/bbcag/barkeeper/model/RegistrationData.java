package ch.bbcag.barkeeper.model;

public class RegistrationData {
	private String username;
	private String email;
	private String phone;
	private String birthdate;
	private String password;
	public RegistrationData() {
		super();
	}
	public RegistrationData(String username, String email, String phone, String birthdate, String password) {
		super();
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.birthdate = birthdate;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
