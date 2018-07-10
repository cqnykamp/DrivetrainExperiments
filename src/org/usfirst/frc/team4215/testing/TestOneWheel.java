package org.usfirst.frc.team4215.testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.usfirst.frc.team4215.robot.wheels.OneWheel;

class TestOneWheel {
	
	OneWheel wheel = new OneWheel("myWheel", 32);
	
	@Test
	public void testWheelName() {
		assertEquals(wheel.name, "myWheel");
	}
	@Test
	public void testWheelID() {
		assertEquals(wheel.id, 32);
	}
	@Test
	public void testWheelSetAndGetPower() {
		wheel.set(.3);
		assertEquals(wheel.getPower(), .3);
	}

}
