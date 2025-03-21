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
    
    public int getPriority();
    public void enqueue(String name, int age, String GPDetails, int priority, boolean fromWard);
    public Object dequeue();
    public boolean isEmpty();
    public Object peek();
    public int size();
    public Object frontElement();
}
