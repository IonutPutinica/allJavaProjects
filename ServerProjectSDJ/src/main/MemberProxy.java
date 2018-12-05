package main;

public class MemberProxy implements Member {
	
   private RealMember member;
	
	public MemberProxy(String name, String cpr) {
		member = new RealMember(name, cpr);
	}
	
	public void setPaid() {
		member.setPaid();
	}
	
	public void setUnpaid() {
		member.setUnpaid();
	}
	
	public String toString() {;
		String returnText = member.toString();
		return returnText;	
	}
	
	public boolean getPayment() {
	   return member.getPayment();
   }
}
