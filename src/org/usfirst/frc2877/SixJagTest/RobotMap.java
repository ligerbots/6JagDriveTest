// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2877.SixJagTest;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc2877.SixJagTest.subsystems.CANJags;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANJaguar driveTrainLFrontJag;
    public static CANJaguar driveTrainRFrontJag;
    public static RobotDrive driveTrainFrontDrive;
    public static CANJaguar driveTrainLMidJag;
    public static CANJaguar driveTrainRMidJag;
    public static RobotDrive driveTrainMidDrive;
    public static CANJaguar driveTrainLBackJag;
    public static CANJaguar driveTrainRBackJag;
    public static RobotDrive driveTrainBackDrive;
    public static final int JAGUAR_COUNT = 6;
    public static CANJags jags = new CANJags(JAGUAR_COUNT);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        driveTrainLFrontJag = jags.init(1, "driveTrainLFrontJag");
        driveTrainLMidJag = jags.init(2, "driveTrainLMidJag");
        driveTrainLBackJag = jags.init(3, "driveTrainLBackJag");
        
        driveTrainRFrontJag = jags.init(4, "driveTrainRFrontJag");
        driveTrainRMidJag = jags.init(5, "driveTrainRMidJag");
        driveTrainRBackJag = jags.init(6, "driveTrainRBackJag");
              
        driveTrainFrontDrive = new RobotDrive(driveTrainLFrontJag, driveTrainRFrontJag);
	
        driveTrainFrontDrive.setSafetyEnabled(true);
        driveTrainFrontDrive.setExpiration(0.2);
        driveTrainFrontDrive.setSensitivity(0.5);
        driveTrainFrontDrive.setMaxOutput(1.0);

        driveTrainFrontDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);        

        driveTrainMidDrive = new RobotDrive(driveTrainLMidJag, driveTrainRMidJag);
	
        driveTrainMidDrive.setSafetyEnabled(true);
        driveTrainMidDrive.setExpiration(0.2);
        driveTrainMidDrive.setSensitivity(0.5);
        driveTrainMidDrive.setMaxOutput(1.0);

        driveTrainMidDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);        

        driveTrainBackDrive = new RobotDrive(driveTrainLBackJag, driveTrainRBackJag);
	
        driveTrainBackDrive.setSafetyEnabled(true);
        driveTrainBackDrive.setExpiration(0.2);
        driveTrainBackDrive.setSensitivity(0.5);
        driveTrainBackDrive.setMaxOutput(1.0);

        driveTrainBackDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
