package com.epam.Design_Pattern_Factory;
import java.math.BigDecimal;
public class WhilteBreadSandwich extends Sandwich 
{ 
	public WhilteBreadSandwich(String desc){ 
		description = desc;
	}
	@Override 
	public BigDecimal price() 
	{ 
		return new BigDecimal("320.0"); 
	} 
}