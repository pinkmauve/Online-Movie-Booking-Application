package com.me.moviesapp.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity(name="account_table")
@Table(name = "account_table")
@PrimaryKeyJoinColumn(name = "personID")
public class Account extends PersonDetails {

	@Column(name = "userName")
	private String username;

	@Column(name = "password")
	private String password;

	@OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
	private Email email;
	
	@OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
	private Cart cart;
	
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Column(name = "usertype")
	private String usertype;
	
	public Account(String username, String password, String usertype) {
		this.username = username;
		this.password = password;
		this.usertype = usertype;
	}

	public Account() {
	
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

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

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	
}