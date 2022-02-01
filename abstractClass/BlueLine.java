package com.Anusha.abstractClass;

public abstract class BlueLine extends Metro{
	
	@Override
	public void blueLine() {
		System.out.println("blue line starts from mahadevpura and ends at HSR layout");
	}
	
	public abstract void yellowLine();
}
