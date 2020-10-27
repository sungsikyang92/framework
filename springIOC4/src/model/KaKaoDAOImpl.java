package model;

public class KaKaoDAOImpl implements BankDAO {

	@Override
	public void deposit(int money) {
		System.out.println("카카오뱅크에 "+money+"원 입금 완료");
	}

}
