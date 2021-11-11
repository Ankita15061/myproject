package com.cg.pkgs;

public class Education{

	public Double Account3()
	{
		Double NEC=0.0;
	
		Double amount=0.0;
		try {
			amount = Account0.getAmount();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		 NEC=(amount*10)/100;
		
		
		
		
		return NEC;
		
	}
	
}
