package chapter5;

public class Student {
	
	String studentName;
	boolean wakeUpTime;
	int money;
	
	public Student(String studentName, int money, boolean wakeUpTime) {
		this.studentName = studentName;
		this.money = money;
		this.wakeUpTime = wakeUpTime;
	}
	
	public void justWalk(Walk walk) {
		walk.take(0);
		this.money -= 0;
	}
	
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "´ÔÀÇ ³²Àº µ·Àº " + money + "¿ø ÀÔ´Ï´Ù.");
	}
}
