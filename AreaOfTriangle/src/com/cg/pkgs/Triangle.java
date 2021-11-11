package com.cg.pkgs;




		public class Triangle {

		  /**
		   * Java method to return area of triangle using vertices as per following
		   * formula area = (Ax(By -Cy) + Bx(Cy -Ay) + Cx(Ay - By))/2
		   * 
		   * @return
		   */
		  public static float area(Point A, Point B, Point C) {
		    float area = (A.x * (B.y - C.y) 
		                    + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f;
		    return Math.abs(area);
		  }

		  /**
		   * 
		   * @param base
		   * @param height
		   * @return
		   */
		  public static float area(int base, int height) {
		    return (base * height) / 2.0f;
		  }
		}


