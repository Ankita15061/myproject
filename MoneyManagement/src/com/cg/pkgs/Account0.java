package com.cg.pkgs;
import java.util.Scanner;

public class Account0 {
	 private static Double amount;

	public static Double getAmount() {
		return amount;
	}

	public static void setAmount(Double amount) {
		Account0.amount = amount;
	}


	public  Account0()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		 amount =sc.nextDouble();
		// return amount;
		
	}

	
	
}


