package chapter5;

public class Walk {

	String walk;
	int money;
	boolean gotUpOnTime;
	
	public Walk(String walk) {
		this.walk = walk;
	}
	
	public void take(int money) {
		this.money = money;
		this.gotUpOnTime = true;
	}
	
	public void showWalkInfo() {
		System.out.println( walk + "�� ���ٸ� " + money + "���� ��� " + "������ ���� �ʾҴٴ� ���� " + gotUpOnTime + "�̴�.");
	}
	
}
