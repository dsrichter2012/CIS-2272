
public class Ticket {

	String strEvent;
	Double dblTicketPrice;
	String strSeatRow;
	int iSeatNumber;

	public Ticket(String strEvent, Double dblTicketPrice, String strSeatRow, int iSeatNumber) {
		this.strEvent = strEvent;
		this.dblTicketPrice = dblTicketPrice;
		this.strSeatRow = strSeatRow;
		this.iSeatNumber = iSeatNumber;
	}

	void PrintValues() {
		System.out.println("TICKET");
		System.out.println(strEvent);
		System.out.format("$%.2f\n", dblTicketPrice);
		System.out.format("Seat %s-%d\n", strSeatRow, iSeatNumber);

	}
	
}
