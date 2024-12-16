package in.abhi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.abhi.binding.Passanger;
import in.abhi.binding.Ticket;
import reactor.core.publisher.Mono;

@Service
public class MakemytripService {
	
	public Mono<Ticket> bookTicket(Passanger p)
	{
		String url="http://localhost:9090/ticket";
		WebClient webClient= WebClient.create();
		Mono<Ticket> mono = webClient.post()
				 .uri(url)
				 .body(BodyInserters.fromValue(p))
				 .retrieve()
				 .bodyToMono(Ticket.class);
		
		return mono;
		
	}
	
	
	public Mono<Ticket[]> getTicket()
	{
		String url="http://localhost:9090/ticket";
		WebClient webClient = WebClient.create();
		Mono<Ticket[]> mono = webClient.get()
				 .uri(url)
				 .retrieve()
				 .bodyToMono(Ticket[].class);
		return mono;
	}
	
	

}
