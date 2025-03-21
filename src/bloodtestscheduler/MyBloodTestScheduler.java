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
public abstract class MyBloodTestScheduler implements QueueInterface {
    
    ArrayList<String> patientQueue;

    public MyBloodTestScheduler() {
        patientQueue = new ArrayList<>();
    }
    
    public void addPatient(String patient) {
        patientQueue.add(patient);
    }
    
    public String displayQueue(){
        return patientQueue.toString();
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
    
    @Override
    public boolean isEmpty() {
        return patientQueue.isEmpty();
    }
    
    @Override
    public void enqueue(String patient) {
        patientQueue.add(patient);
    }
    
    
    
}
