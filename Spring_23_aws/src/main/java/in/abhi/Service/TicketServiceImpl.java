package in.abhi.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.abhi.entity.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	Map<Integer, Ticket> m=new HashMap<>();
	@Override
	public Ticket bookTicket(Passanger p) {
		Ticket t = new Ticket();
		Random r= new Random();
		int id = r.nextInt(5);
		t.setTicketNum(id);
		BeanUtils.copyProperties(p, t);
		t.setStatus("Confirm");
		m.put(id, t);
		return t;
	}

	@Override
	public Collection<Ticket> getAllTicket() {
		// TODO Auto-generated method stub
		return m.values();
	}

}
