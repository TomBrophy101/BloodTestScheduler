/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.LinkedList;

/**
 *
 * @author tombr
 */
//This is the use of the Queue ADL.
public class Patient implements QueueInterface, Comparable<Patient>{
    private String name;
    private int age;
    private String GPDetails;
    private Priority priority;
    private boolean fromWard;
    
    private LinkedList<Patient> queue = new LinkedList<>();

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
        return this.priority;
    }
    
    
    public boolean isFromWard(){
        return fromWard;
    }
    
    @Override
    public int compareTo(Patient patient) {
        return this.priority.compareTo(patient.priority);
    }
    
    @Override
    public void enqueue(Patient patient) {
        queue.add(patient);
    }
}
