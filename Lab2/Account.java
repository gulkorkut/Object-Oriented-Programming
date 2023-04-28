/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinelab2;

/**
 *
 * @author pc
 */
public class Account {
    private int accountNumber;
	private double accountBalance;
	private String ownerName;
	private int key;
	private boolean lockStatus;
	
	
	
	public Account(int accountNumber, double accountBalance, String ownerName) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.ownerName = ownerName;
		key = 1111;
		lockStatus = false;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		if (this.lockStatus) {
			return -1;
		}
		else {
			return accountBalance;
		}
		
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public void setKey(int key) {
		this.key = key;
		
	}

	public void lock(int key) {
		if (this.key == key) {
			this.lockStatus = true;
		}
		
	}

	public void unlock(int key) {
		// TODO Auto-generated method stub
		if (this.key == key) {
			this.lockStatus = false;
		}
		
	}

	public boolean locked() {
		// TODO Auto-generated method stub
		return this.lockStatus;
	}
    
}
