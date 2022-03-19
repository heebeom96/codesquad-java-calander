package honux.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Calendar");

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램

		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int[] maxDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		int month = scanner.nextInt();
		
		
		if (month > 12 || month < 1) {
			System.out.println("달은 1부터 12사이입니다.");
		} else {
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, maxDay[month - 1]);
		}
		scanner.close();
		
	}

}
