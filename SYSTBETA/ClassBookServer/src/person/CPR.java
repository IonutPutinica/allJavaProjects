package person;

public class CPR implements ICPR {
	
	private String cpr;
	
	public CPR(String cpr) {
		this.cpr = cpr;
	}
	
	public void setCPR(String cpr) {
		this.cpr = cpr;
	}
	
	public String getCPR() {
		return cpr;
	}

}
