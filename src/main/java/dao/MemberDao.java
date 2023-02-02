package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.util.OracleUtil;
import vo.MemberVo;

public class MemberDao {

	//싱글턴
	private static MemberDao dao = new MemberDao();
	private MemberDao() {};
	public static MemberDao getMemberDao() {
		return dao;
	}
	
	//업데이트
	public int update(MemberVo member) throws SQLException {
		String sql = "UPDATE MEMBER_TBL_02  \r\n"
				+ "SET phone = ?,ADDRESS = ? ,GRADE = ? ,CITY =? \r\n"
				+ "WHERE custno = ? ";
		
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.getPhone());
		pstmt.setString(2, member.getAddress());
		pstmt.setString(3, member.getGrade());
		pstmt.setString(4, member.getCity());
		pstmt.setInt(4, member.getCustno());
		
		int result = pstmt.executeUpdate();
		pstmt.close();
		return result;
	}
}
