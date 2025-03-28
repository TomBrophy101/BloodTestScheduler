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
        Patient temp1 = new Patient("Tom Brophy", 23, "Dr Holmes", 2, true);
        Patient temp2 = new Patient("Jordan Carthy", 26, "Dr Watson", 1, false);
        Patient temp3 = new Patient("Tre Roberts", 22, "Dr Hibbert", 0, false);
        Patient temp4 = new Patient("Roko Makanovic", 30, "Dr Nick", 1, true);
        Patient temp5 = new Patient("CJ Smith", 24, "Dr Doom", 2, false);
        NoShowList missedPatients = new NoShowList();
        missedPatients.push(temp1);
        missedPatients.push(temp2);
        missedPatients.push(temp3);
        missedPatients.push(temp4);
        missedPatients.push(temp5);
        
        
        MyBloodTestScheduler queuePatients = new MyBloodTestScheduler();
        queuePatients.enqueue("Nisa Agayev", 21, "Dr House", 0, true);
        
        
        
        System.out.println("\nNo Show Patients:");
        System.out.println(missedPatients.displayStack());
        System.out.println("\nQueue Patients:");
        System.out.println(queuePatients.displayQueue());
        
        
        BloodTestSchedulerGUI myGUI = new BloodTestSchedulerGUI();
        myGUI.setVisible(true);
    }
    
}
 