package model;

public class Person {
	private String name;
	private Ticket ticket;
	
	public String getName() {
		return name;
	}
	//	name을 spring ioc container로 부터 주입받는다. (DI: Dependency Injection)
	public void setName(String name) {
		this.name = name;
	}
	public Ticket getTicket() {
		return ticket;
	}
	//	ticket을 spring ioc container로 부터 주입받는다. (DI: Dependency Injection)
	public void setTicket(Ticket ticket) {
		this.ticket=ticket;
	}
}
