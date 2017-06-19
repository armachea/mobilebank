package com.mobileBankFront.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PrimaryAccountInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountId;
	private int accountNumber;
	private BigDecimal accountBalance;
	
	@OneToMany(mappedBy = "primaryAccountInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<PrimaryTransactionInfo> primaryTransactionInfoList;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<PrimaryTransactionInfo> getPrimaryTransactionInfoList() {
		return primaryTransactionInfoList;
	}

	public void setPrimaryTransactionInfoList(List<PrimaryTransactionInfo> primaryTransactionInfoList) {
		this.primaryTransactionInfoList = primaryTransactionInfoList;
	}

	@Override
	public String toString() {
		return "PrimaryAccountInfo [accountId=" + accountId + ", accountNumber=" + accountNumber + ", accountBalance="
				+ accountBalance + ", primaryTransactionInfoList="
				+ primaryTransactionInfoList + "]";
	}


	
	
	
	
	
}
