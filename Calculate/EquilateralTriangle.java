/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author pc
 */
public class EquilateralTriangle implements Calculate{
    private double edge;

    public EquilateralTriangle(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
       return edge*edge*Math.pow(3, 0.5)*0.25;
    }

    @Override
    public double getPerimeter() {
        return 3*edge;
    }
}
