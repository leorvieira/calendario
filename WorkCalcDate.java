import java.time.LocalDate;
import java.util.Date;
import java.time.DayOfWeek;

public class WorkCalcDate implements WorkDiffDay {

	@Override
	public int WorkDiffDays(LocalDate DataInicio, LocalDate DataFim) {
		
		DayOfWeek[] weekDay = DayOfWeek.values();
		LocalDate AuxDateI = DataInicio;
		LocalDate AuxDateF = DataFim;
		String Aux;
		
		int QtdDays = 0;
		int QtdDaysU = 0;
		while (AuxDateI.isBefore(AuxDateF)) {
		
			if (!( AuxDateI.getDayOfWeek().equals(weekDay[5]) ) && !( AuxDateI.getDayOfWeek().equals(weekDay[6]) )) {
				Aux = AuxDateI.toString();
				Aux = Aux.substring(5);
				if (!(Feriado(Aux))){
					QtdDaysU++;
				}
			}
			QtdDays++;
			System.out.println("Data = "+AuxDateI+" "+QtdDaysU );
			AuxDateI = AuxDateI.plusDays(1);

		}
		return QtdDaysU;
	}

	@Override
	public int DiffDays(LocalDate DataInicio, LocalDate DataFim) {
		
		DayOfWeek[] weekDay = DayOfWeek.values();
		LocalDate AuxDateI = DataInicio;
		LocalDate AuxDateF = DataFim;
		String Aux;
		
		int QtdDays = 0;
		int QtdDaysU = 0;
		while (AuxDateI.isBefore(AuxDateF)) {
		
			if (!( AuxDateI.getDayOfWeek().equals(weekDay[5]) ) && !( AuxDateI.getDayOfWeek().equals(weekDay[6]) )) {
				Aux = AuxDateI.toString();
				Aux = Aux.substring(2);
				if (!(Feriado(Aux))){
					QtdDaysU++;
				}
			}
			QtdDays++;
			System.out.println("Data = "+AuxDateI+" "+QtdDays );
			AuxDateI = AuxDateI.plusDays(1);
//			System.out.println(AuxDateI+" "+AuxDateF);
		}
		
//		System.out.println(AuxDateI+" "+AuxDateF);
		return QtdDays;
	}
	
	
	@Override
	public Date ProjDiasUtil() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date RetrDiasUtil() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Feriado(String MesDia) {
		Hollydays[] hollyday = Hollydays.values();
		for (int i=0;i<hollyday.length;i++) {
			if ( hollyday[i].getAnoMes(null).toString().equals(MesDia)) {
				return true;
			}
		}	
		return false;
	}


}
