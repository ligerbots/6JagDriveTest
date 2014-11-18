// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2877.SixJagTest.subsystems;

import org.usfirst.frc2877.SixJagTest.RobotMap;
import org.usfirst.frc2877.SixJagTest.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    CANJaguar lFrontJag = RobotMap.driveTrainLFrontJag;
    CANJaguar rFrontJag = RobotMap.driveTrainRFrontJag;
    RobotDrive frontDrive = RobotMap.driveTrainFrontDrive;
    CANJaguar lMidJag = RobotMap.driveTrainLMidJag;
    CANJaguar rMidJag = RobotMap.driveTrainRMidJag;
    RobotDrive midDrive = RobotMap.driveTrainMidDrive;
    CANJaguar lBackJag = RobotMap.driveTrainLBackJag;
    CANJaguar rBackJag = RobotMap.driveTrainRBackJag;
    RobotDrive backDrive = RobotMap.driveTrainBackDrive;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    double vC = 1.0;

    public void drive(double x, double y) {
        if (frontDrive != null && midDrive != null && backDrive != null) {
            //this is reversed because of the default variable names, which are moveValue and rotateValue, IN THAT ORDER.
            //since the Y controls going forward, we put Y first. If when you press up the robot turns, undo this.
//            if (Robot.driveModeIsShoot) {
                frontDrive.arcadeDrive(vC * x, vC * y);
                midDrive.arcadeDrive(vC * x, vC * y);
                backDrive.arcadeDrive(vC * x, vC * y);
//                SmartDashboard.putNumber("ArcadeDriveX", vC * x);
//                SmartDashboard.putNumber("ArcadeDriveY", vC * y);

            //Despite what the function looks like it says, you do actually want
            //arcadeDrive.(x,y), not (y,x). AAAARRRRRGH.
        }
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
