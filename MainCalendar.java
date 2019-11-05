
import java.time.LocalDate;
public class MainCalendar {
	
	public static void main(String[] args) {
		
		LocalDate DataI = LocalDate.of(2019, 11, 10);
		LocalDate DataF = LocalDate.of(2019, 11, 17);
		
		WorkCalcDate c = new WorkCalcDate();
		
		System.out.println("Dif Dias Uteis = "+c.WorkDiffDays(DataI, DataF));
		
		System.out.println("Dif Dias       = "+c.DiffDays(DataI, DataF));		
		
	}

}
