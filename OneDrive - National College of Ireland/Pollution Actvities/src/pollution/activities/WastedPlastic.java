/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pollution.activities;

/**
 *
 * @author tombr
 */
public class WastedPlastic extends PollutionActivities {
    private int amountDumped;
    private String typeOfDebris;
    private String cleanUpPartner;

    public WastedPlastic(int amountDumped, String typeOfDebris, String cleanUpPartner, int turtlesAffected, int dolphinsAffected, int damageCosts, String location) {
        super(turtlesAffected, dolphinsAffected, damageCosts, location);
        this.amountDumped = amountDumped;
        this.typeOfDebris = typeOfDebris;
        this.cleanUpPartner = cleanUpPartner;
    }

    public int getAmountDumped() {
        return amountDumped;
    }

    public String getTypeOfDebris() {
        return typeOfDebris;
    }

    public String getCleanUpPartner() {
        return cleanUpPartner;
    }
    
    @Override
    public String toString() {
        return "Turtles Affected: " + getTurtlesAffected() + ", Dolphins Affected: " + getDolphinsAffected() + ", Damage Costs: " + getDamageCosts() + ", Location: " + getLocation() + ", Amount Dumped: " + getAmountDumped() + ", Type Of Debris: " + getTypeOfDebris() + ", Clean Up Partner: " + getCleanUpPartner();
    }

}
