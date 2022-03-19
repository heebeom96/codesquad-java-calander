package honux.calendar;

import java.util.Scanner;

public class Calendar {

	private static int[] MaxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int MaxDaysOfMonth(int month) {
		return MaxDays[month - 1];

	}

	public static void main(String[] args) {
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		String Prompt = "cal> ";
		//System.out.print(Prompt);
		//System.out.println("원하는 반복 횟수를 입력하세요.");
		//int times = scanner.nextInt();
		
		
		
		/*for문 사용
		for (int i = 0; i < times; i++) {
			System.out.println("달을 입력하세요.");
			int month = scanner.nextInt();

			if (month > 12 || month < 1) {
				System.out.println("달은 1부터 12사이입니다.");
			} else {
				System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.MaxDaysOfMonth(month));
			}
		}*/
		//while 문 사용
		int month = 1;
		while(month != -1) {
			System.out.println("달을 입력하세요.");
			System.out.print(Prompt);
			month = scanner.nextInt();

			if (month == -1) {
				System.out.println("프로그램을 종료합니다.");
			} else if(month > 12 || month < 1){
				System.out.println("달은 1부터 12사이입니다.");
			}else {
				System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.MaxDaysOfMonth(month));
			}
				
			}
		scanner.close();
		}
		
		
		
	

	}

