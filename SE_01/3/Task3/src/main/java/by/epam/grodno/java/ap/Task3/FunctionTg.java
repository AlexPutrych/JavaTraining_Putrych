package by.epam.grodno.java.ap.Task3;

import java.util.Scanner;

public class FunctionTg {
	private static Scanner in;
	public static void main(String[] args){
		double x, y;
		in = new Scanner(System.in);
		System.out.print("Введите значение a: ");
		double a = in.nextDouble();
		System.out.print("Введите значение b: ");
		double b = in.nextDouble();
		System.out.print("Введите значение h: ");
		double h = in.nextDouble();
	
	for (x=a; x<=b; x += h){
		y = Math.tan(2*x)-3;
			
		System.out.println(x + "   " + y);
	
	}
}}
