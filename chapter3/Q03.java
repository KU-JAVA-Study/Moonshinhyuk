package shmoon.chapter3;

import java.util.Scanner;

public class Q03 {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("정수를 입력하시오>>");
		n = scan.nextInt();
		
		for (int i=n; i>0; i--) {
			for (int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
