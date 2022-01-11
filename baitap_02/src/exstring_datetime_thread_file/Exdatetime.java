package exstring_datetime_thread_file;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exdatetime {
	// a.Tạo pthuc lay tt nam
	public static void infoYear() {
		LocalDate ld = LocalDate.now();
		int currentYear = ld.getYear();
		System.out.println("Current year: " + currentYear);
		boolean isLeap = false;
		if ((currentYear % 400 == 0) || (currentYear % 4 == 0 && currentYear % 100 != 0)) {
			isLeap = true;
		}
		System.out.println("Is current year leap year ? " + isLeap);
		System.out.println("Length of the year: " + ld.getDayOfYear() + " days");
	}

	// b.Tạo pthuc tính khoảng time giữa 2 mốc time
	public static void periodTime(LocalDate date1, LocalDate date2) {
		System.out.println("Period bettween " + date1 + " and " + date2 + ": " + Period.between(date1, date2));
	}

	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	// c.Tạo các pthuc chuyen doi String & datetime
	public static void datetimeToString(LocalDateTime ldt) {
		System.out.println(dtf.format(ldt));
	}

	public static void stringToDatetime(String date_time) {
		System.out.println(LocalDateTime.parse(date_time, dtf));
	}

	// Main run
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("______________________a_______________________");
		infoYear();
		System.out.println("______________________b_______________________");
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = date1.plus(Period.of(2, 3, 4));
		periodTime(date1, date2);
		System.out.println("______________________c_______________________");
		datetimeToString(LocalDateTime.now());
		stringToDatetime("10/01/2022 09:38:44");

	}
}
