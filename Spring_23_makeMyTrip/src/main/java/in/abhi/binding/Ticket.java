package in.abhi.binding;

public class Ticket {
	
	 private Integer ticketNum;
	 private String name;
	 private String email;
	  private String from;
	  private String to;
	  private String doj;
	  private String trianNo;
	  private String status;
	  
	  
	  public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	public Integer getTicketNum() {
		return ticketNum;
	}
	public void setTicketNum(Integer ticketNum) {
		this.ticketNum = ticketNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTrianNo() {
		return trianNo;
	}
	public void setTrianNo(String trianNo) {
		this.trianNo = trianNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNum=" + ticketNum + ", name=" + name + ", email=" + email + ", from=" + from + ", to="
				+ to + ", doj=" + doj + ", trianNo=" + trianNo + ", status=" + status + "]";
	}
	
	  
	  

}
