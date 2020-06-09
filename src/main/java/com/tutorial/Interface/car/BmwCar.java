package com.tutorial.Interface.car;

import com.tutorial.Interface.Car;
import com.tutorial.Interface.Engine;
import com.tutorial.Interface.engine.BmwEngine;

public class BmwCar extends Car{
	
	public String colourOfBmw="New Bmw of Crimson red";
	Engine objOfBmwEngine=new BmwEngine();
	
 public String bmwStart() {
	 String start =start(objOfBmwEngine);
	 return start;
 }

 public String bmwStop() {
	 String stop =stop(objOfBmwEngine);
	 return stop;
 }
}
