package com.tutorial.Interface;

import com.tutorial.Interface.car.BmwCar;
import com.tutorial.Interface.car.BugatiCar;

public class App {

  public static void main(String[] args) {
    BmwCar objOfBmwCar= new BmwCar();
    BugatiCar objOfBugatiCar= new BugatiCar();
    System.out.println("----NEW BMW----");
    System.out.println(objOfBmwCar.colourOfBmw);
    System.out.println(objOfBmwCar.bmwStart());
    System.out.println(objOfBmwCar.bmwStop());
    System.out.println("----NEW Bugati----");
    System.out.println(objOfBugatiCar.colourOfBugati);
    System.out.println(objOfBugatiCar.bugatiStart());
    System.out.println(objOfBugatiCar.bugatiStop());
    
    
  }

}
