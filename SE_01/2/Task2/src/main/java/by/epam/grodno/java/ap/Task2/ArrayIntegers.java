package by.epam.grodno.java.ap.Task2;

import java.util.Scanner;

public class ArrayIntegers {
	private static Scanner in;

	public static void main(String[] args){
		in = new Scanner(System.in);
		System.out.print("Введите кол-во элементов массива: ");
		int k = in.nextInt();
		int a[]; 
		a = new int[k];
		for (int i=0; i <= k-1; i++){
			a[i] = i*2;
			    System.out.print(a[i] + " ");
	}
		        System.out.println();
		int b[];
		b = new int[a.length-1];
		for(int i = 0; i <= a.length-2; i++)
		{
		    b[i] = a[i]*a[i+1];
		        System.out.print(b[i] + " ");
		}
}
	}
