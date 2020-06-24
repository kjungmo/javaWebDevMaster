package chapter5;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private boolean isValid = true;
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
		
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day < 0 || day > 31) {
				isValid = false;
			}
			else {
				this.day = day;
			}
		}
		
	public String isValid() {
		if(this.isValid == true) {
			return "유효한 날짜입니다.";
		}
		else {
			return "유효하지 않은 날짜입니다.";
		}
	}
	
	
}
