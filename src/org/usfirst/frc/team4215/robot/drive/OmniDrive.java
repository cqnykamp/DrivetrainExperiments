package org.usfirst.frc.team4215.robot.drive;

import org.usfirst.frc.team4215.robot.wheels.Wheels;

public class OmniDrive {
	Wheels wheels;
	
	public OmniDrive(Wheels wheels) {
		this.wheels = wheels;
	}
	
	public void drive(double someInputFromJoystickThatCurrentlyDoesNothing) {
		System.out.println("Driving with omni drive");
	}
}
