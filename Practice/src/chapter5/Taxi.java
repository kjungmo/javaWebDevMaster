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
		System.out.println(taxiCompany + "의 택시를 타면 " + money +"원이 들고 " + passengerCount + "명이 타있다.");
	}
}
