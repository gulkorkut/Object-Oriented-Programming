/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinelab2;

/**
 *
 * @author pc
 */
public class Onlinelab2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account(986,412,"Gül");
		System.out.println(acc.getAccountBalance());
		acc.setKey(7777777);
		acc.lock(7777777);
		System.out.println(acc.getAccountBalance());
		acc.unlock(7777777);
		System.out.println(acc.getAccountBalance());
	}

    
}
