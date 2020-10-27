package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.BankService;

public class TestIOC {
	public static void main(String[] args) {
		/*	기존 제어 방식에서 IOC 적용 어플리케이션으로 변경
		 * 	1.	추상화(인터페이스 적용)
		 * 	2.	maven을 통한 spring 실행환경 구축(spring library를 실행환경에 추가)
		 * 	3.	Spring config(ioc.xml)정의
		 * 	4.	ApplicationContext(Spring Container)를 실행하여 필요한 의존 객체 확보(DL or DI)
		 * 	5.	비즈니스 실행(입금 처리)
		 */
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("ioc.xml");
//		BankDAO bank=(BankDAO)factory.getBean("bankDAO");
//		bank.deposit(100);
		BankService service=(BankService)factory.getBean("bankService");
		service.deposit(100);
		factory.close();
	}
}
