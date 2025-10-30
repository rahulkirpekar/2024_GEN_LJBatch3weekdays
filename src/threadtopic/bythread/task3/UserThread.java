package threadtopic.bythread.task3;

public class UserThread extends Thread
{
	private TicketCounter ticketCounter = null;
	private String user = null;
	private int seatToBook;
	private boolean onlyCheck;
	
	
	public UserThread(TicketCounter ticketCounter, String user, int seatToBook, boolean onlyCheck) 
	{
		this.ticketCounter = ticketCounter;
		this.user = user;
		this.seatToBook = seatToBook;
		this.onlyCheck = onlyCheck;
	}
	
	@Override
	public void run() 
	{
		if (onlyCheck) 
		{
			ticketCounter.checkAvailability(user);
		} else 
		{
			ticketCounter.bookTicket(user, seatToBook);
		}
	}
}
