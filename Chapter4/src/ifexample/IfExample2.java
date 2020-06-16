package ifexample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * int score = scanner.nextInt();
		 * 
		 * char grade;
		 * 
		 * if( score <= 59 ) { grade = 'F'; } else if( score < 70 ) { grade ='D'; } else
		 * if( score < 80) { grade = 'C'; } else if( score <90){ grade = 'B'; } else {
		 * grade = 'A'; }
		 * 
		 * System.out.println("score : " + score ); System.out.println("grade : " +
		 * grade );
		 */
		
		int a = 10;
		int b = 20;
		
		int max;
		
		max = (a > b)? a: b;
		System.out.println(max);
	}

}
