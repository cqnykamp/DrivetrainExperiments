package org.usfirst.frc.team4215.robot.drive;

import org.usfirst.frc.team4215.robot.wheels.Wheels;

public class ArcadeDrive {
	
	Wheels wheels;
	
	public ArcadeDrive(Wheels wheels) {
		this.wheels = wheels;
	}
	
	public void drive(double movement, double rotation) {
		System.out.println("Driving with arcade drive");
		wheels.left.set(movement + rotation);
		wheels.right.set(movement - rotation);
	}
}
