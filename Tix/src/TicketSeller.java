
public class TicketSeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ticket myTicket = new Ticket("Beyonce", 75.5, "J", 32);
		myTicket.PrintValues();
		System.out.println("******************");

		int i;
		for (i=1; i<=21; i++) {
		    myTicket = new Ticket("Red Sox vs. Yankees", 120., "BB", i*2);
			myTicket.PrintValues();
			System.out.println("******************");
		}
	
	}

}
