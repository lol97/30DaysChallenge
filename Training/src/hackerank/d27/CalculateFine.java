package hackerank.d27;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculateFine {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int dayReturned = sc.nextInt();
		int monthReturned = sc.nextInt();
		int yearReturned = sc.nextInt();

		int dayDue = sc.nextInt();
		int monthDue = sc.nextInt();
		int yearDue = sc.nextInt();

		LocalDate dateReturned = LocalDate.of(yearReturned, monthReturned, dayReturned);
		LocalDate dateDue = LocalDate.of(yearDue, monthDue, dayDue);

		System.out.println(calculateFine(dateReturned, dateDue));

		sc.close();
	}

	public static long calculateFine(LocalDate dateReturned, LocalDate dateDue) {
		long fine = 0;

		if (dateReturned.isAfter(dateDue)) {

			if (dateDue.getYear() == dateReturned.getYear()) {
				if (dateDue.getMonth() == dateReturned.getMonth()) {
					long differenceDays = ChronoUnit.DAYS.between(dateDue, dateReturned);
					fine = 15 * differenceDays;
				} else {
					long differenceMonths = ChronoUnit.MONTHS.between(dateDue, dateReturned);
					fine = 500 * differenceMonths;
				}
			} else {
				fine = 10000;
			}
		}

		return fine;
	}
}
