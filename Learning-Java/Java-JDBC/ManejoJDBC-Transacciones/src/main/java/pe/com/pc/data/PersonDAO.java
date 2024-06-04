package pe.com.pc.data;

import pe.com.pc.entities.Person;

import java.sql.*;
import java.util.*;

import static pe.com.pc.data.Conexion.*;

public class PersonDAO {
    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona nombre, apellidos, email, telefono VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellidos = ?, email = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

    public List<Person> seleccionar() {
        List<Person> personList = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT);
             ResultSet resultSet = statement.executeQuery()
        ) {
            while (resultSet.next()) {
                int idPersona = resultSet.getInt("id_persona");
                String nombre = resultSet.getString("nombre");
                String apellidos = resultSet.getString("apellidos");
                String email = resultSet.getString("email");
                String telefono = resultSet.getString("telefono");

                Person person = new Person(idPersona, nombre, apellidos, email, telefono);
                personList.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return personList;
    }

    public int insertar(Person person) {
        int nroRows = 0;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_INSERT)
        ) {
            statement.setString(1, person.getNombre());
            statement.setString(2, person.getApellidos());
            statement.setString(3, person.getEmail());
            statement.setString(4, person.getTelefono());

            nroRows = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return nroRows;
    }

    public int actualizar(Person person) {
        int nroRow = 0;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_UPDATE)
        ) {
            statement.setString(1, person.getNombre());
            statement.setString(2, person.getApellidos());
            statement.setString(3, person.getEmail());
            statement.setString(4, person.getTelefono());
            statement.setInt(5, person.getIdPersona());

            nroRow = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return nroRow;
    }

    public int eliminar(Person person) {
        int nroRow = 0;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_DELETE)
        ) {
            statement.setInt(1, person.getIdPersona());

            nroRow = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return nroRow;
    }
}

