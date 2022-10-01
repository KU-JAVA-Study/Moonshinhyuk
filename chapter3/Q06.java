package shmoon.chapter3;

import java.util.Scanner;

public class Q06 {
	
	private static Scanner scan = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int money;
		System.out.print("금액을 입력하시오>>");
		money = scan.nextInt();
		
		for (int i=0; i<unit.length; i++) {
			if ((int)(money/unit[i]) > 0)
				System.out.println(unit[i]+"원 짜리 : "+(int)(money/unit[i])+"개");
			money %= unit[i];
		}
	}

}
