package pe.com.pc.data;

import pe.com.pc.entities.User;

import java.sql.*;
import java.util.*;

import static pe.com.pc.data.Conexion.*;

public class UserDAO {
    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (usuario, password) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    public List<User> seleccionar() {
        List<User> userList = new ArrayList<>();

        try (Connection conn = getConnection();
             PreparedStatement stmnt = conn.prepareStatement(SQL_SELECT);
             ResultSet rs = stmnt.executeQuery();
        ) {
            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");

                userList.add(new User(idUsuario, usuario, password));
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return userList;
    }

    public int insertar(User user) {
        int nroRows = 0;
        try (Connection cnn = getConnection();
             PreparedStatement stmnt = cnn.prepareStatement(SQL_INSERT)
        ) {
            stmnt.setString(1, user.getUsuario());
            stmnt.setString(2, user.getPassword());

            nroRows = stmnt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return nroRows;
    }

    public int actualizar(User user) {
        int nroRows = 0;

        try (Connection cnn = getConnection();
             PreparedStatement stmnt = cnn.prepareStatement(SQL_UPDATE);
        ) {
            stmnt.setString(1, user.getUsuario());
            stmnt.setString(2, user.getPassword());
            stmnt.setInt(3, user.getIdUsuario());

            nroRows = stmnt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return nroRows;
    }

    public int eliminar(User user) {
        int nroRows = 0;

        try (Connection cnn = getConnection();
             PreparedStatement stmnt = cnn.prepareStatement(SQL_DELETE)
        ) {
            stmnt.setInt(1, user.getIdUsuario());

            nroRows = stmnt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return nroRows;
    }
}
