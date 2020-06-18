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
		System.out.println( walk + "로 간다면 " + money + "원이 들고 " + "늦잠을 자지 않았다는 것이 " + gotUpOnTime + "이다.");
	}
	
}
