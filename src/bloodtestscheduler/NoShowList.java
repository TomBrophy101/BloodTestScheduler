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
public abstract class NoShowList implements StackInterface {
    private LinkedList<Patient> missedPatients;

    public NoShowList(LinkedList<Patient> missedPatients) {
        this.missedPatients = missedPatients;
    }
    
    @Override
    public void push(Patient patient){
        missedPatients.addFirst(patient);
    }
    
    @Override
    public Object pop(){
        return missedPatients.isEmpty() ? null : missedPatients.removeFirst();
    }
    
    @Override
    public Object peek(){
        return missedPatients.isEmpty() ? null : missedPatients.getFirst();
    }
    
    @Override
    public boolean isEmpty(){
        return missedPatients.isEmpty();
    }
    
    @Override
    public int size(){
        return missedPatients.size();
    }
    
    @Override
    public String displayStack(){
        StringBuilder sb = new StringBuilder("No-Show Patients:\n");
        for (Patient p : missedPatients) {
            sb.append(p.getName()).append("\n");
        }
        return sb.toString();
    }
    
    @Override
    public String emptyStack(){
        missedPatients.clear();
        return "No-show stack cleared";
    }
}
