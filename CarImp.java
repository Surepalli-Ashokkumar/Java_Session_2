package com.cisco.myinterface;

public class CarImp implements Car
{

	@Override
	public void start() 
	{
		System.out.println("Car start");
		
	}

	@Override
	public void stop() 
	{
		
		System.out.println("car stop");
	}

	
}
