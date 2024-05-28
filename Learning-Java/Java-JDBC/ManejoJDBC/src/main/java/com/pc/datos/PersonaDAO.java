package com.pc.datos;

import com.pc.entidad.Persona;

import java.sql.*;
import java.util.*;

import static com.pc.datos.Conexion.*;

public class PersonaDAO {
    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona (nombre, apellidos, email, telefono)" +
            "VALUES (?, ?, ?, ?)";

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

    public int insertar(Persona persona) {
        int nroRows = 0;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_INSERT)
        ) {
            statement.setString(1, persona.getNombre());
            statement.setString(2, persona.getApellidos());
            statement.setString(3, persona.getEmail());
            statement.setString(4, persona.getTelefono());

            nroRows = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return nroRows;
    }
}

