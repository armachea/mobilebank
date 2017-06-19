package com.mobileBankFront.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId", nullable = false, updatable = false)
	private Long userId;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	@Column(name = "email", nullable = false, updatable = true)
	private String email;
	private String phone;
	
	
	
	private boolean enabled=true;
	
	@OneToOne
	private PrimaryAccountInfo primaryAccountInfo;
	
	@OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<RecipientInfo> recipientInfoList;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public PrimaryAccountInfo getPrimaryAccountInfo() {
		return primaryAccountInfo;
	}

	public void setPrimaryAccountInfo(PrimaryAccountInfo primaryAccountInfo) {
		this.primaryAccountInfo = primaryAccountInfo;
	}

	public List<RecipientInfo> getRecipientInfoList() {
		return recipientInfoList;
	}

	public void setRecipientInfoList(List<RecipientInfo> recipientInfoList) {
		this.recipientInfoList = recipientInfoList;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", username=" + username + ", password=" + password + 
				", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone="
				+ phone + ", enabled=" + enabled
				+ ", primaryAccountInfo=" + primaryAccountInfo + ", recipientInfoList=" + recipientInfoList + "]";
	}

	
	
	
	

}
