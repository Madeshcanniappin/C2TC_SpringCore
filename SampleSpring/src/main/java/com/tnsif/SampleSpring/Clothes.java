package com.tnsif.SampleSpring;

public class Clothes implements Shopping{
   
	@Override
	public void order()
	{
		System.out.println("I'm Ordering some dresses");
	}
}
