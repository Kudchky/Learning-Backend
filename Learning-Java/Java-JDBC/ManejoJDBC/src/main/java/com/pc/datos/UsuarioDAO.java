package com.pc.datos;

import com.pc.entidad.Usuario;

import java.sql.*;
import java.util.*;

import static com.pc.datos.Conexion.*;

public class UsuarioDAO {
    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (usuario, password) VALUES (?, ?)";


    public List<Usuario> seleccionar() {
        List<Usuario> usuarioList = new ArrayList<>();

        try (Connection conn = getConnection();
             PreparedStatement stmnt = conn.prepareStatement(SQL_SELECT);
             ResultSet rs = stmnt.executeQuery();
        ) {
            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");

                usuarioList.add(new Usuario(idUsuario, usuario, password));
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return usuarioList;
    }

    public int insert(Usuario usuario) {
        int nroRow = 0;
        try (Connection cnn = getConnection();
             PreparedStatement stmnt = cnn.prepareStatement(SQL_INSERT)
        ) {
            stmnt.setString(1, usuario.getUsuario());
            stmnt.setString(2, usuario.getPassword());

            nroRow = stmnt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return nroRow;
    }
}
