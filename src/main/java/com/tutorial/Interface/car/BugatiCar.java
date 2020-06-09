package com.tutorial.Interface.car;

import com.tutorial.Interface.Car;
import com.tutorial.Interface.Engine;
import com.tutorial.Interface.engine.BugatiEngine;

public class BugatiCar extends Car{
	public String colourOfBugati="New Bugati of Sky Blue";
	Engine objOfBugatiEngine=new BugatiEngine();
	
 public String bugatiStart() {
	 String start =start(objOfBugatiEngine);
	 return start;
 }

 public String bugatiStop() {
	 String stop =stop(objOfBugatiEngine);
	 return stop;
 }

}
