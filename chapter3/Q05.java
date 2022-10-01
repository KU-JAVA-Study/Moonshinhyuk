package shmoon.chapter3;

import java.util.Scanner;

public class Q05 {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		System.out.print("양의정수 10개를 입력하시오>>");
		for (int i=0; i<10; i++) 
			arr[i] = scan.nextInt();
		
		System.out.print("3의 배수는 ");
		
		for (int j=0; j<10; j++) {
			if (arr[j] % 3 == 0)
				System.out.print(arr[j] + " ");
		}
	}

}
