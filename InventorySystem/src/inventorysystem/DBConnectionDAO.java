
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionDAO {
 
public static void main(String[] args) throws SQLException {
    Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorysystem?useTimezone=true&serverTimezone=UTC","root","root");
System.out.println("Conectado!");
conexao.close();
 
}
}