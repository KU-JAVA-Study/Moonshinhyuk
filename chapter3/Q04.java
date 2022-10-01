package shmoon.chapter3;

import java.util.Scanner;

public class Q04 {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		char[] ch;
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		input = scan.next();
		ch = input.toCharArray();
		
		for (int j=0; j<=(ch[0]-'a'); j++) {
			for (int i='a'; i<=ch[0]-j; i++) {
				System.out.print((char)i);
			}
			System.out.println();
		}
		
	}

}
