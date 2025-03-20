/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author tombr
 */
public interface QueueInterface {
    
    public Priority getPriority();
    public void enqueue(String patient);
    public Object dequeue();
    public boolean isEmpty();
    public Object peek();
    public int size();
    public Object frontElement();
}
