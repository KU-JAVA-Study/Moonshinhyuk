package shmoon.chapter3;

import java.util.Scanner;
import java.util.Random;

public class OpenChallenge {
	
	public static Scanner scan = new Scanner(System.in);
	public static Random r = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = r.nextInt(100);
		int small = 0, big = 99, temp = 1;
		int answer;
		String sel;
		
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		System.out.println(small + "-" + big);
		System.out.print(temp++ + ">>");
		answer = scan.nextInt();
		
		while (true) {
			if (num > answer) {
				small = answer;
				System.out.println("더 높게");
				System.out.println(small + "-" + big);
				System.out.print(temp++ + ">>");
				answer = scan.nextInt();
			}else if(num < answer){
				big = answer;
				System.out.println("더 낮게");
				System.out.println(small + "-" + big);
				System.out.print(temp++ + ">>");
				answer = scan.nextInt();
			}else {
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n)>>");
				sel = scan.next();
				if (sel.equals("y")) {
					num = r.nextInt(100);
					small = 0;
					big = 99;
					temp = 1;
					System.out.println("수를 결정하였습니다. 맞추어 보세요.");
					System.out.println(small + "-" + big);
					System.out.print(temp++ + ">>");
					answer = scan.nextInt();
					continue;
				}else
					break;
			}
		}
		
	}

}
