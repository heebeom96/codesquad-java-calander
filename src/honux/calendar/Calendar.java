package honux.calendar;

import java.util.Scanner;

public class Calendar {

	private static int[] MaxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static int[] LeapMaxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static boolean isLeapYear(int year) {

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static int MaxDaysOfMonth(int month, int year ) {
		if (isLeapYear(year) == true) {
			return (LeapMaxDays[month - 1]);
		} else {
			return MaxDays[month - 1];
		}
	}

	public static void PrintCal(int month, int year, int weekday) {
		System.out.printf("  <<%4d년 %3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("--------------------");
		int maxDays = MaxDaysOfMonth(month, year);
		//print blank 
		for (int j = 0; j < weekday; j++){
			System.out.print("   ");
		}
		
		for (int i = 1 ; i <= maxDays; i++) {
			if ((i + weekday) % 7 == 0) {
				System.out.printf("%3d\n", i);
			} else {
				System.out.printf("%3d", i);
			}
		}

		System.out.println();
	}

	public static void main(String[] args) {

	}
}
