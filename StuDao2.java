import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StuDao2 {
	
	public void add(Stu stu) {
		Connection conn = DBConnection.getConnection();						//��·
		try {
			Statement stm = conn.createStatement();  					    //���Ա 
			String sql = "insert into student values('"+stu.getStudentID()+"','"+stu.getStudentName()+"')";			//��Ϣ
			stm.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBConnection.closeConnection(conn);
		}
	}



	public static void main(String[] args) {
		StuDao2 dao = new StuDao2();
		Scanner in = new Scanner(System.in);
		String studentID = in.nextLine();
		String studentName = in.nextLine();
		Stu stu = new Stu(studentID,studentName);
		dao.add(stu);
	}
	
}
