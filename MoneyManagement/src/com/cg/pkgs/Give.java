package com.cg.pkgs;

public class Give {

	public Double Account6()
	{
		Double NEC=0.0;
	
		Double amount=0.0;
		try {
			amount = Account0.getAmount();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		 NEC=(amount*5)/100;
		
		
		
		
		return NEC;
		
	}
}
