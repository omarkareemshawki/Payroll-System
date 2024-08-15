/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seproj;

/**
 *
 * @author pc
 */

public class Employee{
    
    private String name;
    private int id;
    private double hourlyRate;

    public Employee(String name, int id, double hourlyRate) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

        public void setName(String name) {
              this.name = name;
    }

    public void setId( int id) {
       this.id = id;
    }

    public void setHourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
    }

    
    
   
    
}
   
