/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author tombr
 */
public interface BloodTestInterface {
    public String getName();
    public String getGPDetails();
    public int getAge();
    public Priority getPriority();
    public void enqueue(Patient patient);
    public Object dequeue();
}
