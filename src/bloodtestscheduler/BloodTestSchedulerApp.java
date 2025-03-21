/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author tombr
 */
public class BloodTestSchedulerApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Patient temp1 = new Patient("Tom", 23, "Dr Holmes", 2, true);
        Patient temp2 = new Patient("Jordan", 26, "Dr Watson", 1, false);
        NoShowList missedPatients = new NoShowList();
        missedPatients.push(temp1);
        missedPatients.push(temp2);
        
        MyBloodTestScheduler queuePatients = new MyBloodTestScheduler();
        queuePatients.enqueue("Tom", 23, "Dr Holmes", 2, true);
        
        
        
        System.out.println("\nNo Show Patients:");
        System.out.println(missedPatients.displayStack());
        System.out.println("\nQueue Patients:");
        System.out.println(queuePatients.displayQueue());
        BloodTestSchedulerGUI myGUI = new BloodTestSchedulerGUI();
        myGUI.setVisible(true);
    }
    
}
 