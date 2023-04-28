/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author pc
 */
public class Car {
    private String models;
    private String geartypes;
    private int numberofCars;
    
    public Car(){
    this.models="new model";
    this.geartypes="manual";
    this.numberofCars=1;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        if(models.charAt(0) >= 97 && models.charAt(0)<=122){
            this.models=models;
        }
        
    }

    public String getGeartypes() {
        return geartypes;
    }

    public void setGeartypes(String geartypes) {
        if(geartypes.equals("automatic")||geartypes.equals("manual")) {
            this.geartypes=geartypes;
        }else{
            System.out.println("Types can be automatic or manual");
        }
     
    }

    public int getNumberofCars() {
        return numberofCars;
    }

    public void setNumberofCars(int numberofCars) {
        if(numberofCars>=1 || numberofCars<=100){
        this.numberofCars=numberofCars;
        }
        
    }

   
    
}
