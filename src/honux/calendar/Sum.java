package honux.calendar;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		
		/*
		String number = scanner.nextLine();
		String[] splitnumber = number.split(" ");
		
		int number1 = Integer.parseInt(splitnumber[0]);
		int number2 = Integer.parseInt(splitnumber[1]);
		
		int sum = number1 + number2;
		*/
		int a,b;
		
		String s1,s2;
		//입력
		s1 = scanner.next();
		s2 = scanner.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		int sum = a+b;
		//화면에 출력
		//System.out.println("두 수의 합은 " + sum +"입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.",a,b,sum);
		scanner.close();
	}
}
