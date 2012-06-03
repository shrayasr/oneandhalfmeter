package com.oneandhalf.helpers;

public class FareCalculator
{
	
	private Meters meter;
	private Fares fare;
	
	public FareCalculator()
	{
		meter = Meters.seventeen;
		fare = Fares.oneAndHalf;
	}
	
	public void setMeter(Meters m)
	{
		meter = m;
	}
	
	public void setFare(Fares f)
	{
		fare = f;
	}
	
	public int calculate(String fare_str)
	{
		int fareInt = Integer.parseInt(fare_str);
		int finalFare = fareInt;
		
		if (meter == Meters.seventeen)
			fareInt = (int) (((fareInt/7.0)*9)-1);
		
		System.out.println("Converted Sperm: "+fareInt);
		System.out.println("blah: " +(((fareInt/7)*9)-1));
		
		if (fare == Fares.oneAndHalf)
			finalFare = fareInt + (fareInt/2);
		
		else if (fare == Fares.doubles)
			finalFare = fareInt*2;
		
		return finalFare;
	}
	
}
