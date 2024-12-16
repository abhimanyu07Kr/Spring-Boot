package in.abhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.abhi.binding.Passanger;
import in.abhi.binding.Ticket;
import in.abhi.service.MakemytripService;
import reactor.core.publisher.Mono;

@Controller
public class MakeMyTripController {
	
	@Autowired
	private MakemytripService service;
	
	@PostMapping("/ticket")
	public String ticketBooking(Passanger p,Model model)
	{
		Mono<Ticket> ticket = service.bookTicket(p);
		Mono<Ticket[]> ticket1 = service.getTicket();
		model.addAttribute("ticket", ticket1);
//		Ticket t= ticket.block();
//		model.addAttribute("msg","Your tickt booked, Id="+t.getTicketNum());
		return "index";
	}
	
	@GetMapping("/book-ticket")
	public String bookTicket(Model model) {
	    model.addAttribute("p", new Passanger());
	    return "bookTicket";
	}

	
	@GetMapping("/")
	public String index(Model model)
	{
		Mono<Ticket[]> ticket = service.getTicket();
		model.addAttribute("ticket", ticket);
		return "index";
	}
	

}
