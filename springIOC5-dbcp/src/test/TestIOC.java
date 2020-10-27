package test;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import control.AccountController;

public class TestIOC {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("ioc.xml");
		AccountController c=(AccountController)factory.getBean("accountController");
			try {
				System.out.println(c.findAccountById("1"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			factory.close();
	}
}
