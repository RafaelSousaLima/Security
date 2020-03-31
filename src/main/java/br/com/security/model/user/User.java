package br.com.security.model.user;

import javax.persistence.Column;

import br.com.backend.model.entity.Entity;

@javax.persistence.Entity
public class User extends Entity {

	private static final long serialVersionUID = -9085463204766917226L;

	@Column
	private int id;

	@Column
	private String login;

	@Column
	private String password;

	@Column
	private String email;

	public User() {
		super();
	}

	protected User(int id, String login, String password, String email) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	protected void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

}
