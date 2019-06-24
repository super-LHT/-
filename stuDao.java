import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class stuDao {
	public void add() {
		Connection conn = DBConnection.getConnection();
		try {
			Statement stm = conn.createStatement();
			String sql = "insert student values('001','аЁед')";
			stm.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	stuDao dao = new stuDao();
	dao.add();
}
}
