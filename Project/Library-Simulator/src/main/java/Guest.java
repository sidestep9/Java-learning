public class Guest extends User {
	 String visitReason;
	 
	 Guest(String name, String visitReason) {
	 	super(name);
	 	this.visitReason = visitReason;
	 	status = "Guest";
	 }
	 
	 @Override
	protected void customDetails() {
		System.out.println("Visit reason: " + visitReason);
	}
}