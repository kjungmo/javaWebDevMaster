package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 88);
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubject("����", 94);
		studentKim.setMathSubject("����", 82);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}