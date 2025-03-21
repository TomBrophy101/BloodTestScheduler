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
public class Patient{
    private String name;
    private int age;
    private String GPDetails;
    private int priority;
    private boolean fromWard;
    
    private LinkedList<String> queue = new LinkedList<>();

    public Patient(String name, int age, String GPDetails, int Priority, boolean fromWard) {
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
    
    public int getPriority() {
        return this.priority;
    }
    
    
    public boolean isFromWard(){
        return fromWard;
    }
    
    @Override
    public String toString(){
        return "(Name: " + name + ", Age: " + age + ", GPDetails: " + GPDetails + ", Priority: " + priority + ", From Ward: " + fromWard + ")";
    }
    
    /*@Override
    public Object frontElement() {
        
    }*/
    
    /*
    public void enqueue(String name, int age, String GPDetails, int priority, boolean fromWard) {
       Patient newPatient = new Patient("Tom Brophy", 23, "Dr Holmes", 2, true);
       patientQueue.add(newPatient);
    }*/
    
    /*@Override
    public Object dequeue() {
        if (!queue.isEmpty()) {
            return queue.remove(0);
        } else {
            return null;
        }
    }*/
}
