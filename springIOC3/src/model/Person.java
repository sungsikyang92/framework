package model;

public class Person {
	private String name;
	private Ticket ticket;
	//	Spring IOC Container로 부터 name과 ticket을 주입받는다(DI)
	public Person(String name, Ticket ticket) {
		super();
		this.name=name;
		this.ticket=ticket;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket=ticket;
	}
}
