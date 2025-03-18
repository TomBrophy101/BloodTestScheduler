/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author tombr
 */
public abstract class Patient implements QueueInterface, Comparable<Patient>{
    private String name;
    private int age;
    private String GPDetails;
    private Priority Priority;
    private boolean fromWard;

    public Patient(String name, int age, String GPDetails, Priority Priority, boolean fromWard) {
        this.name = name;
        this.age = age;
        this.GPDetails = GPDetails;
        this.Priority = Priority;
        this.fromWard = fromWard;
    }
    
    
    public String getName() {
        return name;
    }

    
    public String getGPDetails() {
        return GPDetails;
    }

    @Override
    public Priority getPriority() {
        return Priority;
    }
    
   
    public int getAge(){
        return age;
    }
    
    public boolean isFromWard(){
        return fromWard;
    }
}
