/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pollution.activities;

/**
 *
 * @author tombr
 */
public class OilSpill extends PollutionActivities {
    private int litresSpilt;
    private String causeOfSpill;
    private String companyResponsible;

    public OilSpill(int litresSpilt, String causeOfSpill, String companyResponsible, int turtlesAffected, int dolphinsAffected, int damageCosts, String location) {
        super(turtlesAffected, dolphinsAffected, damageCosts, location);
        this.litresSpilt = litresSpilt;
        this.causeOfSpill = causeOfSpill;
        this.companyResponsible = companyResponsible;
    }

    public int getLitresSpilt() {
        return litresSpilt;
    }

    public String getCauseOfSpill() {
        return causeOfSpill;
    }

    public String getCompanyResponsible() {
        return companyResponsible;
    }

    public void setLitresSpilt(int litresSpilt) {
        this.litresSpilt = litresSpilt;
    }

    public void setCauseOfSpill(String causeOfSpill) {
        this.causeOfSpill = causeOfSpill;
    }

    public void setCompanyResponsible(String companyResponsible) {
        this.companyResponsible = companyResponsible;
    }
    
    @Override
    public String printDetails(){
        return super.printDetails() + ", Litres Spilt: " + litresSpilt + ", Cause of Spill: " + causeOfSpill + ", Company Responsible: " + companyResponsible;
    }
}
