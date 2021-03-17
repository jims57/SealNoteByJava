package net.zcoo.seal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users") //>>mysql model>>spring mysql model>>mysql entity
public class DAOUser {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
    //>>model auto pk field>>java model auto field>>auto field>>pk field>>model pk field
	private long id;

	@Column
	private String username;

	@Column
	@JsonIgnore //>>ignore file>>model ignore field
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
