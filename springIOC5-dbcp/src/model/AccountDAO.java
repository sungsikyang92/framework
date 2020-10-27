package model;

import java.sql.SQLException;

public interface AccountDAO {
/*	메서드 오버라이딩 규칙: 메서드명, 매개변수 동일해야 하고
 * 	접근제어자는 하위로 갈수록 범위가 좁아져서는 안되고
 *	상위 메서드에서 선언한 Exception 또는 하위 Exception만 throws 가능하다.
 */
	public AccountVO findAccountById(String id) throws SQLException;
}	

