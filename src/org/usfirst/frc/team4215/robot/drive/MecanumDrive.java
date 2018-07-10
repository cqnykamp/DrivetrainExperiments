package org.usfirst.frc.team4215.robot.drive;

import org.usfirst.frc.team4215.robot.wheels.Wheels;

public class MecanumDrive {
	
	Wheels wheels;
	
	public MecanumDrive(Wheels wheels) {
		this.wheels = wheels;
	}
	
	public void drive(double magnitude, double theta, double rotation) {
		System.out.println("Driving with mecanum drive");

	}
}
