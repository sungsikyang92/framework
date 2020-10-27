package test;

import model.KbBankDAOImpl;

public class TestOld {
	public static void main(String[] args) {
		//	기존 제어 방식으로 입금처리
		//	필요한 객체를 생성해서 사용한다
		KbBankDAOImpl bank=new KbBankDAOImpl();
		bank.deposit(100);
	}
}
