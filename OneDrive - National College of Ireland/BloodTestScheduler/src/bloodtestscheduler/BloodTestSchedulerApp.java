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
    private MyBloodTestScheduler scheduler;
    private NoShowList noShowList;

    public BloodTestSchedulerApp(MyBloodTestScheduler scheduler, NoShowList noShowList) {
        this.scheduler = scheduler;
        this.noShowList = noShowList;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        BloodTestSchedulerGUI myGUI = new BloodTestSchedulerGUI();
        myGUI.setVisible(true);
    }
    
}
