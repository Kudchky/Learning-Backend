package com.pc.datos;

import com.pc.entidad.Persona;

import java.sql.*;
import java.util.*;

import static com.pc.datos.Conexion.*;

public class PersonaDAO {
    private static final String SQL_SELECT = "SELECT * FROM persona";

    private static final String COL_ID_PERSONA = "id_persona";
    private static final String COL_NOMBRE = "nombre";
    private static final String COL_APELLIDOS = "apellidos";
    private static final String COL_EMAIL = "email";
    private static final String COL_TELEFONO ="telefono";

    public List<Persona> selection() {
        List<Persona> personaList = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT);
             ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                int idPersona = resultSet.getInt(COL_ID_PERSONA);
                String nombre = resultSet.getString(COL_NOMBRE);
                String apellidos = resultSet.getString(COL_APELLIDOS);
                String email = resultSet.getString(COL_EMAIL);
                String telefono = resultSet.getString(COL_TELEFONO);

                Persona persona = new Persona(idPersona, nombre, apellidos, email, telefono);
                personaList.add(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return personaList;
    }

    public void insertar() {

    }
}

