package 日付;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class task {
	public static void main(String[] args) throws Exception {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2021/10/23", f);

		String str = d.format(f);
		System.out.println(str);
	}
}
