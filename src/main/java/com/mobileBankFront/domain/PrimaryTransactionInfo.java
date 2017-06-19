package com.mobileBankFront.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PrimaryTransactionInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transactionId;
	private String description;
	private String type;
	private String status;
	private double amount;
	private BigDecimal availableBalance;
	private Date transactionDateOfCreation;
	
	@ManyToOne
	@JoinColumn(name = "primary_account_id")
	private PrimaryAccountInfo primaryAccountInfo;
	
	public PrimaryTransactionInfo (){
		
	}

	public PrimaryTransactionInfo(String description, String type, String status, double amount,
			BigDecimal availableBalance, Date transactionDateOfCreation, PrimaryAccountInfo primaryAccountInfo) {
		super();
		this.description = description;
		this.type = type;
		this.status = status;
		this.amount = amount;
		this.availableBalance = availableBalance;
		this.transactionDateOfCreation = transactionDateOfCreation;
		this.primaryAccountInfo = primaryAccountInfo;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	public Date getTransactionDateOfCreation() {
		return transactionDateOfCreation;
	}

	public void setTransactionDateOfCreation(Date transactionDateOfCreation) {
		this.transactionDateOfCreation = transactionDateOfCreation;
	}

	public PrimaryAccountInfo getPrimaryAccountInfo() {
		return primaryAccountInfo;
	}

	public void setPrimaryAccountInfo(PrimaryAccountInfo primaryAccountInfo) {
		this.primaryAccountInfo = primaryAccountInfo;
	}

	@Override
	public String toString() {
		return "PrimaryTransactionInfo [transactionId=" + transactionId + ", description=" + description + ", type="
				+ type + ", status=" + status + ", amount=" + amount + ", availableBalance=" + availableBalance
				+ ", transactionDateOfCreation=" + transactionDateOfCreation + ", primaryAccountInfo="
				+ primaryAccountInfo + "]";
	}
	
	
	
}
