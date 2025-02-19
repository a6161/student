package fruitManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JdbcUtils {
	public static final String className = "com.mysql.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/data01";

	public static final String user = "root";
	public static final String password = "root";
	public JdbcUtils() {
		try {//�������ݿ�
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		try {//�������ݿ�
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return null;
		
	}
	public static void close(ResultSet res,PreparedStatement statement,Connection con) {
			try {
				if(res != null){
				res.close();
				}
				if(statement != null) {
					statement.close();
				}
				if(con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
	}
}