import java.sql.*;

public class TestMySQLJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, "root", "MmELC@h505");
            Statement instruccion = connection.createStatement();
            var sql = "SELECT * FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()) {
                System.out.print("Id Persona: " + resultado.getInt("id_persona"));
                System.out.print("| Nombre: " + resultado.getString("nombre"));
                System.out.print("| Apellidos: " + resultado.getString("apellidos"));
                System.out.print("| Email: " + resultado.getString("email"));
                System.out.print("| Telefono: " + resultado.getString("telefono"));
                System.out.println();
            }
            resultado.close();
            instruccion.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
