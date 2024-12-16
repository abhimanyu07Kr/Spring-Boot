package in.abhi.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.abhi.Service.Passanger;
import in.abhi.Service.TicketService;
import in.abhi.entity.Ticket;

@RestController
public class TicketController {

	@Autowired
	private TicketService ser;
	
	
	@PostMapping("/ticket")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger p)
	{
		Ticket ticket = ser.bookTicket(p);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
	@GetMapping("/ticket")
	public ResponseEntity<Collection<Ticket>> getTicket()
	{
		Collection<Ticket> allTicket = ser.getAllTicket();
		return new ResponseEntity<>(allTicket,HttpStatus.OK);
	}
}
