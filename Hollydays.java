
public enum Hollydays {

	
			AnoNovo 				("01-01"),
			DiaDoTrabalho 			("05-01"),
			ProclamacaoRepublica	("11-15"),
			ConcienciaNegra			("11-20"),
			Natal 					("12-25"); 	
		
	private final String MesDia;
	
	private Hollydays(String MesDia){
		this.MesDia = MesDia;	
	}
	
	public String getDayHollyday(Hollydays hollyday) {
		
		return Hollydays.AnoNovo.toString();
		
	}
	
	public String getAnoMes(Hollydays hollyday) {
		return this.MesDia;
		
	}
	
	
	
	
}
