package in.abhi.Service;

import java.util.Collection;

import in.abhi.entity.Ticket;

public interface TicketService {
	
	public Ticket bookTicket(Passanger p);
	
	public Collection<Ticket> getAllTicket();

}
