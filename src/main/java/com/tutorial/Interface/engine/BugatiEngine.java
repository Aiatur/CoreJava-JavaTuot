package com.tutorial.Interface.engine;

import com.tutorial.Interface.Engine;

public class BugatiEngine implements Engine {
	private double hp=90.1;
	private int torque=10000;
	
	@Override
	public String startEngine(int key) {
		String start="start the BUGATI engine with HP: "+hp+" Torque: "+torque;
		String stop="stop the BUGATI engine with HP: "+"0"+" Torque: "+"0";
		if(key==1)
		{
			return start;
		}
		else
		{
			return stop;
		}
	}
	@Override
	public String speed()
	{
		return "speed of BUGATI";
	}

}
