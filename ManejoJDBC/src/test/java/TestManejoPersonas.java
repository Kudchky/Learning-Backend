import datos.PersonaDAO;
import entidad.Persona;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        List<Persona> personaList = personaDAO.selection();

        for (Persona persona: personaList) {
            System.out.println(persona);
        }
    }
}
