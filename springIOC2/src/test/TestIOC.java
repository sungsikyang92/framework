package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Person;

public class TestIOC {
	public static void main(String[] args) {
		//Spring IOC Container(시작 시점에 spring config인 ioc.xml을 로딩한다.)
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("ioc.xml");
		//DL: Dependency Lookup 의존 대상을 검색
		Person p=(Person)factory.getBean("person");
		System.out.println(p.getName());
		p.getTicket().ticketing();
		factory.close();
	}
}
