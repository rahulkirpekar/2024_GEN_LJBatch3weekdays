package threadtopic.bythread.task3;

// resource
public class TicketCounter 
{
	private int totalTicketSeats = 20;
	// resource method
	public synchronized void bookTicket(String user, int numberSeats) 
	{
		System.out.println(user + " is trying to buy " + numberSeats + " seats."); 
		
		if(numberSeats <= totalTicketSeats) 
		{
			System.out.println(numberSeats+" seats successfully bookes for "+ user);
			
			totalTicketSeats = totalTicketSeats - numberSeats; 
			
			System.out.println("Seats remaning : " +totalTicketSeats); 
		}else 
		{
			System.out.println("Sorry , " + user+", only  " + totalTicketSeats+" seats available , Booking failed...!");
		}
		System.out.println("--------------------------------------------");
	}
	
	public void checkAvailability(String user) 
	{
		System.out.println(user+" checked Availability. seats left : " + totalTicketSeats);
		System.out.println("--------------------------------------------");
	}
}
