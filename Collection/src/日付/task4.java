package 日付;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class task4 {
	public static void main(String[] args) throws Exception {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2021/1/28", f);
	
	
		String str = d.format(f);
		System.out.println(str);
	}
}
