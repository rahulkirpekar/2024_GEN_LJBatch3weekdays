package threadtopic.bythread.task3;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TicketCounter ticketCounter = new TicketCounter();
		
		
		UserThread ganeshUser = new UserThread(ticketCounter, "Ganesh", 3, false);
		UserThread rahulUser = new UserThread(ticketCounter, "Rahul", 5, false);
		UserThread ankurUser = new UserThread(ticketCounter, "Ankur", 0, true);
		UserThread sagarUser = new UserThread(ticketCounter, "Sagar", 8, false);
		UserThread kunalUser = new UserThread(ticketCounter, "Kunal", 10, false);
		UserThread rameshUser = new UserThread(ticketCounter, "Ramesh", 90, false);
		
		
		// set daemon--- method --- service provider
		
		ganeshUser.setDaemon(true);
		
		ganeshUser.start();
		rahulUser.start();
		ankurUser.start();
		sagarUser.start();
		kunalUser.start();
		rameshUser.start();
		
	}
}
