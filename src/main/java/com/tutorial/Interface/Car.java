package com.tutorial.Interface;
 import com.tutorial.Interface.Engine;
public class Car {

	public String start(Engine objOfEngine)
	{
		String start=objOfEngine.startEngine(1);
		return start;
	}
	public String stop(Engine objOfEngine)
	{
		String stop=objOfEngine.startEngine(0);
		return stop;
	}
	
}
