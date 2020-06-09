package com.tutorial.Interface.gear;

import com.tutorial.Interface.Gear;

public class BmwGear implements Gear {

	@Override
	public String shiftUP() {
		String shiftUp="Bmw Gear Shift up";
		return shiftUp;
	}

	@Override
	public String shiftDown() {
		String shiftDown="Bmw Gear Shift down";
		return shiftDown;
	}

}
