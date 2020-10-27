package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Person;
import model.Ticket;

public class TestIOC {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("ioc.xml");
		Ticket t=(Ticket)factory.getBean("ticket");//DL 방식으로 ticket 객체를 확보해 사용
		t.ticketing();
		Person p=(Person)factory.getBean("person");//DL 방식으로 person 객체를 확보해 사용
		System.out.println(p.getName());//DI 방식으로 주입받은 name을 출력
		p.getTicket().ticketing();//DI 방식으로 주입받은 ticket의 ticketing()을 실행
		factory.close();
	}
}
