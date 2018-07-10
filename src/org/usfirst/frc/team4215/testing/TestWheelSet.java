package org.usfirst.frc.team4215.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;
import org.usfirst.frc.team4215.robot.wheels.OneWheel;
import org.usfirst.frc.team4215.robot.wheels.WheelSet;

class TestWheelSet {
	
	OneWheel one = new OneWheel("wheelOne", 7);
	OneWheel two = new OneWheel("wheelTwo", 3);
	
	@Test
	void testWithOnlyOneWheel() {
		WheelSet wheelSet = new WheelSet("set", new OneWheel[] {one});
		wheelSet.set(-0.25);
		assertEquals(one.getPower(), -0.25);
	}
	
	@Test
	void testWithZeroOneWheels() {
		WheelSet wheelSet = new WheelSet("set", new OneWheel[] {});
		HashSet<OneWheel> emptySet = new HashSet<OneWheel>();
		assertEquals(wheelSet.getHashSet(), emptySet);
	}
	
	@Test
	void testWithMultipleOneWheels() {
		WheelSet wheelSet = new WheelSet("set", new OneWheel[] {one, two});
		wheelSet.set(.6);
		assertEquals(one.getPower(), .6);
		assertEquals(two.getPower(), .6);
	}

}
