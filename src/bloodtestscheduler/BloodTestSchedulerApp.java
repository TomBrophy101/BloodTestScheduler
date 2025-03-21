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
        Patient temp = new Patient("Tom", 23, "Dr Holmes", 2, true);
        NoShowList missedPatients = new NoShowList();
        missedPatients.push(temp);
        BloodTestSchedulerGUI myGUI = new BloodTestSchedulerGUI();
        myGUI.setVisible(true);
    }
    
}
 