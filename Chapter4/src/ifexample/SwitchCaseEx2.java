package ifexample;

import java.util.Scanner;

public class SwitchCaseEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		int numDays;
		
		switch(month) {
			case 1: case 3: case 5: case 7:case 8:case 10:case 12: 
				numDays = 31;
				break;
			case 2: 
				numDays = 28;
				break;
			case 4: case 6: case 9: case 11:
				numDays = 30;
				break;
			default : 
				System.out.println("Error");
				numDays = 0;
		}
		
		System.out.println( month + "월에는 " + numDays + "일이 있습니다. ");
	}

}
