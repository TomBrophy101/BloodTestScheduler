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
public abstract class Patient implements QueueInterface, Comparable<Patient>{
    private String name;
    private int age;
    private String GPDetails;
    private Priority priority;
    private boolean fromWard;
    
    private LinkedList<String> queue = new LinkedList<>();

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
    public void enqueue(String patient) {
        queue.add(patient);
    }
    
    @Override
    public Object dequeue() {
        if (!queue.isEmpty()) {
            return queue.remove(0);
        } else {
            return null;
        }
    }
}
