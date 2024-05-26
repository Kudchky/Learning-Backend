package datos;

import entidad.Persona;

import java.sql.*;
import java.util.*;

import static datos.Conexion.*;

public class PersonaDAO {
    private static final String SQL_SELECT = "SELECT * FROM persona";

    public List<Persona> selection() {
        List<Persona> personaList = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT);
             ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                int idPersona = resultSet.getInt("id_persona");
                String nombre = resultSet.getString("nombre");
                String apellidos = resultSet.getString("apellidos");
                String email = resultSet.getString("email");
                String telefono = resultSet.getString("telefono");

                Persona persona = new Persona(idPersona, nombre, apellidos, email, telefono);
                personaList.add(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return personaList;
    }
}

