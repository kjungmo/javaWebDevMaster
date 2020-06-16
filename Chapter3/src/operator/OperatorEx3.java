package operator;

public class OperatorEx3 {

	public static void main(String[] args) {

		int score = 100;
		
		System.out.println(++score);
		System.out.println(score++);
		System.out.println(score);
		System.out.println(--score);
		System.out.println(score--);
		System.out.println(score);
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println(value); // 앞이 false 나와서 뒤 항은 연산 안됐다
		
		boolean value2 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println(num1);  //OR연산자이기 때문에 뒤 연산됐다.
		System.out.println(i);
		
		System.out.println(value2);
		
	}

}
