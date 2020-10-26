package test;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Tool;

public class TestIOC {
	public static void main(String[] args) {
		//Spring IOC Container: 객체를 생성하여 제어하는 역할(Singleton 방식으로 운용)
		/*	기존 제어방식(TestTool의 예)에서
		 * 	→	스프링 IOC Container(ApplicationContext)를 이용해
		 * 		스프링 설정 파일 ioc.xml을 시스템 시작시에 읽어서 필요 객체를
		 * 		생성한 후 어플리케이션에서 bean id를 요청하면 생성한 객체를 반환해준다.
		 * 	→	의존 대상 객체(ex - Tool 이 Hammer에서 Spade로 변경)
		 * 		를 바꾸더라도 기존 소스 코드는 변경할 필요가 없다.
		 * 	→	유지보부성 향상
		 */
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("ioc.xml");
		Tool tool=(Tool)factory.getBean("tool");
		tool.work();
		factory.close();
		//ioc.xml에서 class를 Hammer와 Spade로 바꿔줄 때 마다 다르게 출력 된다.
	}
}
