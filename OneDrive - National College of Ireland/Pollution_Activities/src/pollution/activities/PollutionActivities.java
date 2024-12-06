/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pollution.activities;

/**
 *
 * @author tombr
 */
public class PollutionActivities {
    protected int turtlesAffected;
    protected int dolphinsAffected;
    protected int damageCosts;
    protected String location;

    public PollutionActivities() {
    }

    public PollutionActivities(int turtlesAffected, int dolphinsAffected, int damageCosts, String location) {
        this.turtlesAffected = turtlesAffected;
        this.dolphinsAffected = dolphinsAffected;
        this.damageCosts = damageCosts;
        this.location = location;
    }

    public void setTurtlesAffected(int turtlesAffected) {
        this.turtlesAffected = turtlesAffected;
    }

    public void setDolphinsAffected(int dolphinsAffected) {
        this.dolphinsAffected = dolphinsAffected;
    }

    public void setDamageCosts(int damageCosts) {
        this.damageCosts = damageCosts;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTurtlesAffected() {
        return turtlesAffected;
    }

    public int getDolphinsAffected() {
        return dolphinsAffected;
    }

    public int getDamageCosts() {
        return damageCosts;
    }

    public String getLocation() {
        return location;
    }
    
    public String printDetails() {
        return "Location: " + location + ", Turtles Affected: " + turtlesAffected + ", Dolphins Affected: " + dolphinsAffected + ", Damage Costs: €" + damageCosts;
    }
}
