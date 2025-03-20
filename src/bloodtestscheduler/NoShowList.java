/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;
import java.util.LinkedList;

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
                empty += missedPatients.get(i);
            }
            return empty;
        } else {
            return empty;
        }
    }
    
    @Override
    public String emptyStack(){
        missedPatients.clear();
        return "No-show stack cleared";
    }
}
