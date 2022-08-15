package 日付;

import java.time.LocalDate;

public class main{

	  public static void main(String[] args) {
		Task t = new Task(LocalDate.of(2021, 10, 21), "牛乳を買う");
		System.out.println(t.getTask());
	}

}
