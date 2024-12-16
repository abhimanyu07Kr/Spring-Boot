package in.abhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.abhi.binding.Ticket;
import in.abhi.binding.passanger;
import in.abhi.service.MakeMyTripService;

@Controller
public class MakeMyTripController {

    @Autowired
    private MakeMyTripService ser;

    @GetMapping("/")
    public String index(Model model) {
        List<Ticket> allTicket = ser.getAllTicket();
        model.addAttribute("Tickets", allTicket);
        return "index";
    }

    @GetMapping("/bookticket")
    public String bookTicket(Model model) {
        model.addAttribute("p", new passanger());
        return "bookTicket";
    }

    @PostMapping("/ticket")
    public String ticketBooking(@ModelAttribute("p") passanger p, Model model) {
        Ticket ticket = ser.bookTicket(p);
        model.addAttribute("ticket", ticket);
        return "index"; // Change this to a confirmation page if needed
    }
}
