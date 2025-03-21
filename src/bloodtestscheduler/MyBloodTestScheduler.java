/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;

/**
 *
 * @author tombr
 */
public class MyBloodTestScheduler implements QueueInterface {
    
    ArrayList<Patient> patientQueue;

    public MyBloodTestScheduler() {
        patientQueue = new ArrayList<>();
    }
    
    public void addPatient(Patient patient) {
        patientQueue.add(patient);
    }
    
    public String displayQueue(){
        StringBuilder sb = new StringBuilder();
        for(Patient p : patientQueue) {
            sb.append("Name: ").append(p.getName()).append(", Age: ").append(p.getAge()).append(", GPDetails: ").append(p.getGPDetails()).append(", Priority: ").append(p.getPriority()).append(", From Ward: ").append(p.isFromWard()).append("\n");
        }
        return sb.toString();
    }
    
    public String getName(){
        return "Tom Brophy";
    }
    
    public int getAge(){
        return 23;
    }
    
    public String getGPDetails(){
        return "Dr Holmes, Luciana";
    }
    
    
    @Override
    public int getPriority(){
        return 2;
    }
    
    public boolean isFromWard(){
        return true;
    }
    
    @Override
    public boolean isEmpty() {
        return patientQueue.isEmpty();
    }
    
    @Override
    public void enqueue(String name, int age, String GPDetails, int priority, boolean fromWard) {
        Patient newPatient = new Patient(name, age, GPDetails, priority, fromWard);
        patientQueue.add(newPatient);
    }
    
    
    @Override
    public Object dequeue() {
        // Remove the first patient from the queue and return it
        if (!isEmpty()) {
            return patientQueue.remove(0);
        }
        return null;
    }

    @Override
    public Object peek() {
        // Return the patient at the front without removing it
        if (!isEmpty()) {
            return patientQueue.get(0);
        }
        return null;
    }

    @Override
    public int size() {
        // Return the current size of the queue
        return patientQueue.size();
    }

    @Override
    public Object frontElement() {
        // Get the patient at the front of the queue
        if (!isEmpty()) {
            return patientQueue.get(0);
        }
        return null;
    }
}
