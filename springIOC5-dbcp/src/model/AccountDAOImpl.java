package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class AccountDAOImpl implements AccountDAO {
	private DataSource dataSource;
	//	spring ioc container로 부터 dbcp를 주입받는다. = DI
	public AccountDAOImpl(DataSource dataSource) {
		super();
		this.dataSource=dataSource;
	}
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	@Override
	public AccountVO findAccountById(String id) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		AccountVO vo=null;
		try {
			con=dataSource.getConnection();	//dbcp로 부터 커넥션을 빌려온다.
			String sql="SELECT name, balance FROM account WHERE id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next())
				vo=new AccountVO(id, rs.getString(1), rs.getInt(2));
		}finally {
			closeAll(rs,pstmt,con);
		}
		return vo;
	}
}
