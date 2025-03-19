/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author tombr
 */
public interface StackInterface {
    public void push(Patient patient);
    public Object pop();
    public Object peek();
    
    public boolean isEmpty();
    public int size();
    public String displayStack();
    public String emptyStack();
}
