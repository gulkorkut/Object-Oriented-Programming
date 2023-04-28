/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.onlinelab2;

/**
 *
 * @author pc
 */
public interface Lockable {
        public void setKey(int key);
	public void lock(int key);
	public void unlock(int key);
	public boolean locked();
}
