package shmoon.chapter4;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q01();
//		Q02();
//		Q03();
//		Q04();
//		Q05();
//		Q06();
//		Q07();
//		Q08();
//		Q09();
//		Q10();
//		Q11();
		Q12();
		
	}
	
	private static void Q01() {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
	
	private static void Q02() {
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
	}
	
	private static void Q03() {
		Song song = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");
		song.show();
	}
	
	private static void Q04() {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함힙니다.");
	}
	
	private static void Q05() {
		CircleManager CM = new CircleManager(3);
		CM.show();
	}
	
	private static void Q06() {
		CircleManager CM2 = new CircleManager(3);
		CM2.biggest();
	}
	
	private static void Q07() {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
 
	private static void Q08() {
		int num;
		System.out.print("인원수>>");
		num = scanner.nextInt();
		PhoneBook PB = new PhoneBook(num);
		PB.search();
	}
	
	private static void Q09() {
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1, 100, 77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
	
	private static void Q10() {
		DicApp da = new DicApp();
	}
	
	private static void Q11() {
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		int a, b;
		String sel;
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		sel = scanner.next();
		if (sel.equals("+")) {
			add.setValue(a, b);
			System.out.println(add.calculate());
		}else if (sel.equals("-")) {
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		}else if (sel.equals("*")) {
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		}else if (sel.equals("/")) {
			div.setValue(a, b);
			System.out.println(div.calculate());
		}
			
	}
	
	private static void Q12() {
		ConcertReserve CR = new ConcertReserve();
		
	}
}


class TV {
	private String company;
	private int year, inch;
	
	TV(String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		String str = this.company + "에서 만든 " + this.year + "년형 " + this.inch + "인치 TV";
		System.out.println(str);
	}
}


class Grade {
	private int math, science, english;
	
	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	double average() {
		return (this.math + this.science + this.english)/3;
	}
}


class Song {
	private String title, artist, country;
	private int year;
	
	
	Song() {
		this.title = null;
		this.artist = null;
		this.country = null;
		this.year = 0;
	}
	
	Song(int year, String country, String artist, String title) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	
	void show() {
		System.out.println(this.year + "년 " + this.country + "국적의 " + this.artist + "가 부른 " + this.title);
	}
}


class Rectangle {
	private int x, y, width, height;
	
	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		return this.width * this.height;
	}
	
	void show() {
		System.out.println("(" + this.x + ", " + this.y + ")에서 크기가 " + this.width + "x" + this.height + "인 사각형");
	}
	
	boolean contains(Rectangle r) {
		if (this.x < r.getX() && this.y < r.getY() && this.x + this.width > r.getX() + r.getWidth() && this.y + this.height > r.getY() + r.getHeight())
			return true;
		else
			return false;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}


class Circle {
	private double x, y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	double circle() {
		return this.radius * this.radius * 3.14;
	}

	public void show() {
		System.out.println("(" + this.x + "," + this.y + ")" + this.radius);
	}
}


class CircleManager {
	private Circle[] c;
	private static Scanner scanner = new Scanner(System.in);
	
	CircleManager(int num) {
		this.c = new Circle[num];
		for (int i=0; i<num; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}
	}
	
	void show() {
		for (int i=0; i<c.length; i++) c[i].show();
	}
	
	
	void biggest() {
		double tmp = 0;
		int index = 0;
		for (int i=0; i<c.length; i++) {
			if(c[i].circle() >= tmp) {
				tmp = c[i].circle();
				index = i;
			}
		}
		System.out.print("가장 면적이 큰 원은 ");
		c[index].show();
	}
}


class Day {
	private String work;
	
	Day() {
		this.work = null;
	}
	
	public void set(String work) {
		this.work = work;
	}
	
	public String get() {
		return work;
	}
	
	public void show() {
		if(work == null) 
			System.out.println("없습니다.");
		else 
			System.out.println(work + "입니다.");
	}
}

class MonthSchedule {
	private Day[] day;
	private static Scanner scanner  = new Scanner(System.in);
	
	MonthSchedule(int num) {
		day = new Day[num];
		for (int i=0; i<day.length; i++) {
			day[i] = new Day();
		}
	}
	
	void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		this.menu();
	}
	
	void menu() {
		int sel, date;
		String work;
		
		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			sel = scanner.nextInt();
			if (sel == 1) {
				System.out.print("날짜(1~30)?");
				date = scanner.nextInt();
				System.out.print("할일(빈칸없이입력)?");
				work = scanner.next();
				day[date].set(work);
				System.out.println();
			}else if (sel == 2) {
				System.out.print("날짜(1~30)?");
				date = scanner.nextInt();
				System.out.print(date + "일의 할 일은 ");
				day[date].show();
				System.out.println();
			}else if (sel == 3){
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}



class Phone {
	private String name, tel;
	
	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}

class PhoneBook {
	private Phone[] phone;
	private static Scanner scanner = new Scanner(System.in);
	
	PhoneBook(int num) {
		phone = new Phone[num];
		for (int i=0; i<phone.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력>>");
			String name = scanner.next();
			String tel = scanner.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}
	
	void search() {
		String name;
		boolean check = false;
		while (true) {
			System.out.print("검색할 이름>>");
			name = scanner.next();
			if (name.equals("그만"))
				break;
			
			for (int i=0; i<phone.length; i++) {
				if (name.equals(phone[i].getName())) {
					System.out.println(name + "의 번호는 " + phone[i].getTel() + " 입니다.");
					check = true;
					break;
				}
			}
			if (check == true) 
				check = false;
			else 
				System.out.println(name + "이 없습니다.");
		}
	}
}


class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int index = 0;
		for (int i=0; i<a.length; i++) {
			c[index++] = a[i];
		}
		for (int j=0; j<b.length; j++) {
			c[index++] = b[j];
		}
		
		return c;
	}
	
	public static void print(int[] a) {
		System.out.print("[ ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
	}
}


class Dictionary {
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		for (int i=0; i<kor.length; i++) {
			if (word.equals(kor[i])) {
				return eng[i];
			}
		}
		return null;
	}
}

class DicApp {
	private static Scanner scanner = new Scanner(System.in);
	
	DicApp() {
		System.out.println("항녕 단어 검색 프로그램입니다.");
		this.menu();
	}
	
	void menu() {
		String word;
		
		while (true) {
			System.out.print("한글 단어?");
			word = scanner.next();
			if (word.equals("그만")) {
				break;
			}
			if (Dictionary.kor2Eng(word) != null) 
				System.out.println(word + "은 " + Dictionary.kor2Eng(word));
			else
				System.out.println(word + "는 저의 사전에 없습니다.");
		}
	}
}


class Add {
	private int a, b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return this.a + this.b;
	}
}

class Sub {
	private int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return this.a - this.b;
	}
}

class Mul {
	private int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return this.a * this.b;
	}
}

class Div {
	private int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return this.a / this.b;
	}
}


class Seat {
	private String name;
	
	Seat() {
		this.name = "---";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	void print() {
		System.out.print(this.name + " ");
	}
}


class ConcertReserve {
	private Seat[] S, A, B;
	private static Scanner scanner = new Scanner(System.in);
	
	ConcertReserve() {
		S = new Seat[10];
		for (int i=0; i<S.length; i++) 
			S[i] = new Seat();
		A = new Seat[10];
		for (int i=0; i<A.length; i++)
			A[i] = new Seat();
		B = new Seat[10];
		for (int i=0; i<B.length; i++)
			B[i] = new Seat();
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		this.menu();
	}
	
	void menu() {
		int sel;
		while (true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			sel = scanner.nextInt();
			if (sel == 1) {
				sel1();
			}else if (sel == 2) {
				sel2();
			}else if (sel == 3) {
				sel3();
			}else if (sel == 4) {
				break;
			}else {
				System.out.println("잘못된 입력입니다 처음부터 ㄲ");
			}
		}
	}
	
	void sel1() {
		int sel, num;
		String name;
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		sel = scanner.nextInt();
		if (sel == 1) {
			System.out.print("S>>");
			printSeat(S);
			System.out.print("이름>>");
			name = scanner.next();
			System.out.print("번호>>");
			num = scanner.nextInt();
			S[num-1].setName(name);
		}else if (sel == 2) {
			System.out.print("A>>");
			printSeat(A);
			System.out.print("이름>>");
			name = scanner.next();
			System.out.print("번호>>");
			num = scanner.nextInt();
			A[num-1].setName(name);
		}else if (sel == 3) {
			System.out.print("B>>");
			printSeat(B);
			System.out.print("이름>>");
			name = scanner.next();
			System.out.print("번호>>");
			num = scanner.nextInt();
			B[num-1].setName(name);
		}else {
			System.out.println("잘못된 입력입니다 처음부터 ㄲ");
		}
	}
	
	void sel2() {
		System.out.print("S>>");
		printSeat(S);
		System.out.print("A>>");
		printSeat(A);
		System.out.print("B>>");
		printSeat(B);
		System.out.println("조회를 완료하였습니다.");
	}
	
	void sel3() {
		int sel;
		String name;
		
		System.out.print("좌석 S:1, A:2, B:3>>");
		sel = scanner.nextInt();
		if (sel == 1) {
			System.out.print("S>>");
			printSeat(S);
			System.out.print("이름>>");
			name = scanner.next();
			for (int i=0; i<S.length; i++) {
				if (name.equals(S[i].getName())) {
					S[i].setName("---");
				}
			}
		}else if (sel == 2) {
			System.out.print("A>>");
			printSeat(A);
			System.out.print("이름>>");
			name = scanner.next();
			for (int i=0; i<A.length; i++) {
				if (name.equals(A[i].getName())) {
					S[i].setName("---");
				}
			}
		}else if (sel == 3) {
			System.out.print("B>>");
			printSeat(B);
			System.out.print("이름>>");
			name = scanner.next();
			for (int i=0; i<B.length; i++) {
				if (name.equals(B[i].getName())) {
					B[i].setName("---");
				}
			}
		}else {
			System.out.println("잘못된 입력입니다 처음부터 ㄲ");
		}
	}
	
	void printSeat(Seat[] seat) {
		for (int i=0; i<seat.length; i++) {
			seat[i].print();
		}
		System.out.println();
	}
}

