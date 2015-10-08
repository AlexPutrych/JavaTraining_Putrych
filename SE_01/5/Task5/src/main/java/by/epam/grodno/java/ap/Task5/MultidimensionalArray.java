package by.epam.grodno.java.ap.Task5;

import java.util.Scanner;

public class MultidimensionalArray {
	private static Scanner in;
	public static void main(String[] args){
		in = new Scanner(System.in);
		System.out.print("Введите размер массива n x n: ");
		int LINES = in.nextInt();
		int [][] p = new int [LINES][];
		for (int i=0; i<LINES; i++){
			p[i] = new int [LINES];
			for (int j=0; j<LINES; j++){
				if (j==i || j==(LINES-1)-i)
				   p[i][j]=1;
				System.out.print(p[i][j] + " ");
			}
			System.out.println();
			}	
		}
	}

