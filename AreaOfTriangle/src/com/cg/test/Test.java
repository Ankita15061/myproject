package com.cg.test;

import java.util.Scanner;

import com.cg.pkgs.Point;
import com.cg.pkgs.Triangle;

public class Test{
		
		

		  public static void main(String[] args) {
			  
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter the coordinates for A");
			  int x1=sc.nextInt();
			  int y1=sc.nextInt();
			  Point A = new Point(x1, y1);
			  
			  System.out.println("Enter the coordinates for B");
			  int x2=sc.nextInt();
			  int y2=sc.nextInt();
			  Point B = new Point(x2, y2);
			  
			  System.out.println("Enter the coordinates for C");
			  int x3=sc.nextInt();
			  int y3=sc.nextInt();
		   
		   
		  
		    
		    
		    Point C = new Point(x3, y3);
		    System.out.println("area of triangle : "
		        + Triangle.area(A, B, C));
		  
		  }

		}


