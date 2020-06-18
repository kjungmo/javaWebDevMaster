package chapter5;

public class GoSchoolTest {

	public static void main(String[] args) {

		Student studentK = new Student("Ko", 50000, false);
		Student studentL = new Student("La", 45000, true);
		
		Taxi taxiKakao = new Taxi("KaKao");
		Walk walk = new Walk("�ɾ");
		
		studentK.takeTaxi(taxiKakao);
		studentL.justWalk(walk);
		
		studentK.showInfo();
		studentL.showInfo();
		
		taxiKakao.showTaxiInfo();
		walk.showWalkInfo();
		
	}

}
