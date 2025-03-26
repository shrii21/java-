import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBInsert {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your id to delete");
		int id=scanner.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			Statement statement=connection.createStatement();  
			String query="DELETE FROM `mydb`.`user` WHERE (`id` = '"+id+"')";
			
			int i=0;
			i=statement.executeUpdate(query);
			if(i!=0)
			{
				System.out.println("Data deleted");
			}
	
			
		} catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
