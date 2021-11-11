package com.cg.test;

import com.cg.pkgs.*;



public class Test {
	public static void main(String[] args) {
		Account0 a1 =new Account0();
		Necessity n=new Necessity();
		FinancialFreedomAccount f=new FinancialFreedomAccount();
		Give g=new Give();
		LongTermSpendingSaving l=new LongTermSpendingSaving();
		Play p=new Play();
		Education e=new Education();
		
		a1.equals(p);
		
		Double d1=n.Account1();
		System.out.println("NEC");
		System.out.println(d1);
		
		System.out.println("\t");
		
		Double d2=f.Account2();
		System.out.println("FFA");
		System.out.println(d2);
		
		System.out.println("\t");
		
		Double d3=e.Account3();
		System.out.println("EDU");
		System.out.println(d3);
		
		System.out.println("\t");
		
		Double d4=l.Account4();
		System.out.println("LTTS");
		System.out.println(d4);
		
		System.out.println("\t");
		
		Double d5=p.Account5();
		System.out.println("PLAY");
		System.out.println(d5);
		
		System.out.println("\t");
		
		Double d6=g.Account6();
		System.out.println("GIVE");
		System.out.println(d6);
	
	};

}
 