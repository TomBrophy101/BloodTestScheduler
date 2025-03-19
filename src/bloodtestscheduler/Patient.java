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
    private Priority priority;
    private boolean fromWard;

    public Patient(String name, int age, String GPDetails, Priority Priority, boolean fromWard) {
        this.name = name;
        this.age = age;
        this.GPDetails = GPDetails;
        this.priority = Priority;
        this.fromWard = fromWard;
    }
    
    
    public String getName() {
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getGPDetails() {
        return GPDetails;
    }
    
    @Override
    public Priority getPriority() {
        return priority;
    }
    
    
    public boolean isFromWard(){
        return fromWard;
    }
    
    @Override
    public int compareTo(Patient other) {
        return this.priority.compareTo(other.priority);
    }
    
    @Override
    public abstract void enqueue(Patient patient);
}
