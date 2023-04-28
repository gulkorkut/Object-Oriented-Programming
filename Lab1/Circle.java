/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.circle;

/**
 *
 * @author pc
 */
public class Circle {

    private int radius;
    private final double pi=3.14;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
    public double getArea() {
    return pi * radius * radius;
}
    public double getCircumference() {
    return pi * radius * 2;
}
   public boolean compareArea(Circle circle) {
	if (circle.getArea()>this.getArea()) {
		return true;
	}
	else if (circle.getArea()<this.getArea()) {
		return false;
	}
	else
		return false;
}
			
	
    
}
