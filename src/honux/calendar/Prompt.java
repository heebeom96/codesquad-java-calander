package honux.calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "cal>";

	public  int parseDay(String week) {
		if (week.equals("SU")) {return 0;}
		else if(week.equals("MO")) { return 1;}
		else if(week.equals("TU")) { return 2;}
		else if(week.equals("WE")) {return 3;}
		else if(week.equals("TH")) { return 4;}
		else if(week.equals("FR")) {return 5;}
		else if(week.equals("SA")) {return 6;}
		else { return 7;}
		
		
	}
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		String Prompt = "cal> ";
		int month = 1;
		int year = 0;
		
		while (month != -1) {
			System.out.println("년을 입력하세요.");
			System.out.print("YEAR>");
			year = scanner.nextInt();
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH>");		
			month = scanner.nextInt();
			System.out.println("첫쨰 날의 요일을 입력하세요(SU, MO , TU, WE, TH, FR, SA).");
			String str_weekday = scanner.next();
			
		    int	weekday = parseDay(str_weekday);
			System.out.println(weekday);
			if (month == -1) {
				System.out.println("프로그램을 종료합니다.");
			} else if (month > 12 || month < 1) {

				System.out.println("달은 1부터 12사이입니다.");
			} else {
				cal.PrintCal(month,year, weekday); // print calendar
				
				System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.MaxDaysOfMonth(month,year));
			}

		}
		scanner.close();
	}

	public static void main(String[] args) {

		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();

	}
}
