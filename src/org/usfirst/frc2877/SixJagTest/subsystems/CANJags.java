/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2877.SixJagTest.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Administrator
 */
public class CANJags {
    public CANJag jags[];
    
    public CANJags(int number) {
        // CAN bus numbering could start at 1, 2, or any other value
        // We make the array two larger than it needs to be, just in case..
        jags = new CANJag[number+2];
        for(int i=1; i<jags.length; i++) jags[i] = null;
    }
    
    public CANJaguar init(int i, String description) {
       CANJag j = new CANJag(i, description);
       jags[i] = j;
       return j.getJag();
    }
    
    public void UpdateDashboard()
    {
        // Display all the CANJags that were actually configured
        for(int i=1; i<jags.length; i++) {
            if (jags[i] != null)
            {
                CANJag j = jags[i];
                SmartDashboard.putBoolean(Integer.toString(i), j.getStat());
                SmartDashboard.putNumber("V:"+ j.getDescr(), j.getVoltage());
                SmartDashboard.putNumber("A:"+ j.getDescr(), j.getCurrent());
            }
        }
    }
    
}
