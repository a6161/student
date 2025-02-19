package fruitManager;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FruitDao_imp {
	public static final String SQL_INSERT=" INSERT INTO fruit VALUES(?,?,?,?,?)";
	public static final String SQL_DELETE=" DELETE FROM fruit WHERE id=?";
	public static final String SQL_UPDATE=" UPDATE fruit SET quantity=? WHERE id=?";
	public static final String SQL_SELECT=" SELECT * FROM fruit WHERE name=?";
	//1,添加
	public boolean insert(Fruit fruit) {
		Connection con = JdbcUtils.getConnection();
		PreparedStatement statement = null;
		try {
			statement = con.prepareStatement(SQL_INSERT);
			statement.setInt(1,fruit.getId());
			statement.setString(2,fruit.getName());
			statement.setString(3,fruit.getType());
			statement.setBigDecimal(4,fruit.getPrice());
			statement.setInt(5,fruit.getQuantity());
			int line = statement.executeUpdate();
			return line>0?true:false;
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			JdbcUtils.close(null, statement,con);
		}
		return false;
	}
	//2,删除(根据编号)
	public boolean delete(Fruit fruit) {
		Connection con = JdbcUtils.getConnection();
		PreparedStatement statement = null;
		try {
			statement = con.prepareStatement(SQL_DELETE);
			statement.setInt(1, fruit.getId());
			int line = statement.executeUpdate();
			return line>0?true:false;
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			JdbcUtils.close(null, statement, con);
		}
		return false;
	}
	//3,修改（根据编号修改库存数量）
	public boolean update(Fruit fruit) {
		Connection con = JdbcUtils.getConnection();
		PreparedStatement statement = null;
		try {
			statement = con.prepareStatement(SQL_UPDATE);
			statement.setInt(1,fruit.getQuantity());
			statement.setInt(2,fruit.getId());
			int line = statement.executeUpdate();
			return line>0?true:false;
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			JdbcUtils.close( null, statement,con);
		}
		return false;
	}
	//4,查询(根据水果名称)
	public Fruit select(String name) {
		Connection con = JdbcUtils.getConnection();
		PreparedStatement statement = null;
		ResultSet res = null;
		try {
			statement = con.prepareStatement(SQL_SELECT);
			statement.setString(1,name);
			res = statement.executeQuery();
			while(res.next()) {
				int id = res.getInt(1);
				String name1 = res.getString(2);
				String type = res.getNString(3);
				BigDecimal price = res.getBigDecimal(4);
				int quantity = res.getInt(5);
				return new Fruit(id,name1,type,price,quantity);
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			JdbcUtils.close(res,statement,con);
		}
		return null;
		
	}
}