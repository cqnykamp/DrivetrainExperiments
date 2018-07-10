/**
 * Experimental project implementing some ideas about the drivetrain
 * 
 * Essentially, this project splits apart the drivetrain code into
 * multiple components. Most of the code deals with the wheels.
 * "OneWheel" is the class that has all the functions to control a
 * particular wheel: set power, set port number, etc. The "WheelSet"
 * and "Wheels" classes group OneWheel  objects together so that you
 * can do the above functions for multiple wheels at once.
 * 
 * There are also classes to drive the wheels: TankDrive, MecanumDrive,
 * etc. These classes are *separate* from the wheel classes. They
 * currently don't do that much.
 * 
 * Also, this project right now doesn't have anything WPILIB-related
 * in it. Without having access to the robot, you can run the program
 * (it just prints things to the console).
 *  
 * To get a sense for how this code works, see "OneWheel", "WheelSet",
 * and "Wheels".
 * To get a sense for how this code would be used, see code below.
 */

package org.usfirst.frc.team4215.robot;


import org.usfirst.frc.team4215.robot.drive.ArcadeDrive;
import org.usfirst.frc.team4215.robot.drive.MecanumDrive;
import org.usfirst.frc.team4215.robot.drive.TankDrive;
import org.usfirst.frc.team4215.robot.wheels.OneWheel;
import org.usfirst.frc.team4215.robot.wheels.WheelSet;
import org.usfirst.frc.team4215.robot.wheels.WheelSnapshot;
import org.usfirst.frc.team4215.robot.wheels.Wheels;

public class Main {

	public static void main(String[] args) {
	
		Wheels wheels = new Wheels();
		
		//set power to one wheel, a subset of wheels, or all the wheels
		//once you run the program, see console for the result
		wheels.backRight.set(.5);
		
		System.out.println();
		wheels.right.set(.25);
		
		System.out.println();
		wheels.set(1);

		
		//get power from any given wheel
		
		System.out.println();
		
		double frontRightPower = wheels.frontRight.getPower();
		System.out.println(frontRightPower);
		
		//wheels.backRight.name
		//wheels.backRight.id

		wheels.stop();
		
		
		System.out.println();
		//useful for mecanum driving
		wheels.frontLeftBackRight.set(3);
		wheels.frontRightBackLeft.set(2);
		
		
		//Using A Drive Class To Control the Wheels
		
		System.out.println();
		
		TankDrive tank = new TankDrive(wheels);
		tank.drive(1, -1);
		
		System.out.println();
		
		ArcadeDrive arcade = new ArcadeDrive(wheels);
		arcade.drive(.5, .2);
		
		//MecanumDrive mecanum = new MecanumDrive(wheels);
		//mecanum.drive(.5, Math.PI/2, 0);
	
		
		
		//Take a snapshot of all the properties on all the wheels
		
		System.out.println();
		wheels.backLeft.getSnapshot().printAllProperties();
		
		System.out.println();
		wheels.getSnapshot().printAllProperties();
		
		System.out.println();
		wheels.frontRightBackLeft.getSnapshot().printAllProperties();
		
	}

}
