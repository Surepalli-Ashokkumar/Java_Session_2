package com.cisco.myinterface;

public class UseCar 
{

	public static void main(String[] args) 
	{
		Car car1 = new CarImp();
		car1.start();
		car1.stop();
		
		Car car2 = new CarImp();
		car2.start();
		car2.stop();
		
		
	}

}
