package com.mobileBankFront.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class RecipientInfo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long recipientId;
	private String name;
	private String email;
	private String phone;
	private String recipientAccountNumber;
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private UserInfo userInfo;

	public Long getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(Long recipientId) {
		this.recipientId = recipientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getRecipientAccountNumber() {
		return recipientAccountNumber;
	}

	public void setRecipientAccountNumber(String recipientAccountNumber) {
		this.recipientAccountNumber = recipientAccountNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@Override
	public String toString() {
		return "RecipientInfo [recipientId=" + recipientId + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", recipientAccountNumber=" + recipientAccountNumber + ", description=" + description
				+ ", userInfo=" + userInfo + "]";
	}
	
	
}
