package model;

public class BankServiceImpl implements BankService {
	private BankDAO bankDAO;
	//Spring IOC Container로 부터 의존 대상을 주입받는다. = DI
	public BankServiceImpl(BankDAO bankDAO) {
		this.bankDAO=bankDAO;
	}
	@Override
	public void deposit(int money) {
		System.out.println("계좌에 대한 트랜잭션 관리");
		bankDAO.deposit(money);
		System.out.println("입금처리에 대한 이력 저장");
	}

}
