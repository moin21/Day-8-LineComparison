package com.linecomparison;

import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program!!");
		System.out.println(lengthCalculation());
	}
	public static double lengthCalculation() {
		Scanner sc = new Scanner(System.in);
		double x1,x2,y1,y2;
		
		System.out.println("Enter Values For First Point");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		
		System.out.println("Enter Values For Second Point");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		double length = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		return length;}
}
