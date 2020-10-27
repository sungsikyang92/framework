package control;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountVO;

public class AccountController {
	private AccountDAO accountDAO;
	public AccountController(AccountDAO accountDAO) {
		super();
		this.accountDAO=accountDAO;
	}
	public AccountVO findAccountById(String id) throws SQLException {
		return accountDAO.findAccountById(id);
	}
}
