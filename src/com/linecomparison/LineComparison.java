package com.linecomparison;

import java.util.Scanner;

public class LineComparison {
	public static int x1, x2, y1, y2, x3, x4, y3, y4;
	public static double length1 = lengthCalculation(x1, x2, y1, y2);
	public static double length2 = lengthCalculation(x3, x4, y3, y4);
	static String s1=String.valueOf(length1); 
	static String s2=String.valueOf(length2);

	public static void main(String[] args) {
		/*
		 * Taking user input for both points
		 */
		System.out.println("Welcome to Line Comparison Computation Program!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter points for First Line");
		System.out.println("Enter Values For First Point");
		x1 = sc.nextInt();
		y1 = sc.nextInt();

		System.out.println("Enter Values For Second Point");
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		System.out.println("Enter points for Second Line");
		System.out.println("Enter Values For First Point");
		x3 = sc.nextInt();
		y3 = sc.nextInt();

		System.out.println("Enter Values For Second Point");
		x4 = sc.nextInt();
		y4 = sc.nextInt();
		sc.close();
		/*
		 * Calling method to check equality
		 */
		 LineComparison compare =new LineComparison();
	       compare.lengthComparison(s1, s2);
	}
/*
 * Method for line length calculation
 */
	public static double lengthCalculation(int x1, int x2, int y1, int y2) {

		double length = (double) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return length;
	}

	/*
	 * Method to check equality in lengths of lines
	 */
	public void lengthComparison(String s1,String s2) {
		if(s1.equals(s2)) {
	    	   System.out.println("Two line are equal");
	       }
	       else if(s1.compareTo(s2)>0){
     	   System.out.println("length of line1 is greater than line2");
        }
	       else {
	    	   System.out.println("length of line2 is greater than line1");
	       }
	}
}
