package com.tutorial.Interface.engine;

import com.tutorial.Interface.Engine;

public class BmwEngine implements Engine {
	private double hp=4.2;
	private int torque=7000;
	
	public String startEngine(int key) {
		String start="start the BMW engine with HP: "+hp+" Torque: "+torque;
		String stop="stop the BMW engine with HP: "+"0"+" Torque: "+"0";
		if(key==1)
		{
			return start;
		}
		else
		{
			return stop;
		}
	}
	public String speed()
	{
		return "speed of bmw";
	}

}
