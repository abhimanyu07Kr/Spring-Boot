package in.abhi.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.abhi.binding.Ticket;
import in.abhi.binding.passanger;

@Service
public class MakeMyTripService {
	
	public Ticket bookTicket(passanger p)
	{
		String url="http://localhost:9090/ticket";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> forEntity = rt.postForEntity(url, p,Ticket.class);
		Ticket body = forEntity.getBody();
		return body;
	}
	
	public List<Ticket> getAllTicket()
	{
		String url="http://localhost:9090/ticket";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket[]> entity = rt.getForEntity(url, Ticket[].class);
		Ticket[] body = entity.getBody();
		List<Ticket> asList = Arrays.asList(body);
		return asList;
	}

}
