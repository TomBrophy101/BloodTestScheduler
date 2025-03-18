/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.PriorityQueue;

/**
 *
 * @author tombr
 */
public class MyBloodTestScheduler implements BloodTestInterface {
    
    private PriorityQueue<Patient> patientQueue;

    public MyBloodTestScheduler() {
        patientQueue = new PriorityQueue<>();
    }
    
    public void addPatient(Patient patient) {
        patientQueue.add(patient);
        System.out.println("Added patient: " + patient.getName() + " with priority " + patient.getPriority());
    }
    
    public Patient getNextPatient() {
        return patientQueue.poll();
    }
    
    public String displayQueue(){
        if(patientQueue.isEmpty()) {
            return "No patients in queue";
        }
        StringBuilder sb = new StringBuilder("Current PatientQueue:\n");
        for (Patient p : patientQueue) {
            sb.append(p.getName()).append(" - ").append(p.getPriority()).append(" - ").append(p.getAge()).append("\n");
        }
        return sb.toString();
    }
    
    public String getName(){
        return "Tom Brophy";
    }
    
    public String getGPDetails(){
        return "Dr Holmes, Luciana";
    }
    
    
    public int getAge(){
        return 21;
    }
    
    @Override
    public Priority getPriority(){
        return Priority.Urgent;
    }
    
    
    @Override
    public void enqueue(Patient patient){
        patientQueue.add((Patient) patient);
    }
    
    @Override
    public Object dequeue(){
        return patientQueue.remove(0);
    }
}
