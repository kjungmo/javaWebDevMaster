package chapter5;

public class Taxi {

	String taxiCompany;
	int passengerCount;
	int money;
	
	public Taxi(String taxiCompany) {
		this.taxiCompany = taxiCompany;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
		
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiCompany + "�� �ýø� Ÿ�� " + money +"���� ��� " + passengerCount + "���� Ÿ�ִ�.");
	}
}
