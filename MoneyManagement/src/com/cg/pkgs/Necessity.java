package com.cg.pkgs;

public class Necessity {
	public Double Account1()
	{
		Double NEC=0.0;
	
		Double amount=0.0;
		try {
			amount = Account0.getAmount();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		 NEC=(amount*55)/100;
		
		
		
		
		return NEC;
		
	}

}
