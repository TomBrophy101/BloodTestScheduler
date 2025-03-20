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
//This is the use of the Stack ADL.
public class NoShowList implements StackInterface {
    ArrayList<Patient> missedPatients;

    public NoShowList(ArrayList<Patient> missedPatients) {
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
        String empty = "";
        if(!missedPatients.isEmpty()){
            for(int i = 0; i < missedPatients.size(); i++) {
                empty += missedPatients.get(i) + "\n";
            }
            return empty;
        } else {
            empty = "Stack is empty";
            return empty;
        }
    }
    
    
}
