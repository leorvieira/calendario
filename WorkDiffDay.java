import java.util.Date;
import java.time.LocalDate;

public interface WorkDiffDay {
	
	public int WorkDiffDays(LocalDate DataInicio, LocalDate DataFim); 

	public Date ProjDiasUtil();
	
	public Date RetrDiasUtil();
	
	public boolean Feriado(String MesDia);

	int DiffDays(LocalDate DataInicio, LocalDate DataFim);

	

}
