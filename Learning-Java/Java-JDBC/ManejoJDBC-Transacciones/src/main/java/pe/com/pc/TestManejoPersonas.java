package pe.com.pc;

import pe.com.pc.data.*;
import pe.com.pc.entities.User;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
//        PersonaDAO personaDAO = new PersonaDAO();
//        List<Usuario> usuarioList = personaDAO.selection();
//        System.out.println("________________Resultado_______________");
//
//        personaList.forEach(System.out::println);

        /*
        personaDAO.insertar(new Persona("Brenda", "Sagastegui", "bsagastegui@gmail.com",
        "988888745"));
        */

        /*
        int actualizarFila = personaDAO.actualizar(new Persona(24, "Pepito", "Cholan",
         "pcholan@gmail" +
               ".com", "987456123"));
        */

//        int borrarFila = personaDAO.eliminar(new Persona(9));
//
//        System.out.println("______________Resultado 2________________");
//        personaList = personaDAO.selection();
//        personaList.forEach(el -> System.out.println(el.toString()));
//
//        System.out.println("Se borro fila ? " + borrarFila);

        UserDAO userDao = new UserDAO();

        //usuarioDao.insertar(new Usuario("amidamaru", "gft565@fdf"));

        List<User> userList = userDao.seleccionar();

        userList.forEach(System.out::println);

        //usuarioDao.actualizar(new Usuario(2, "meliodas", "gfddd344343"));
        userDao.eliminar(new User(3));

        userList = userDao.seleccionar();

        System.out.println("_____________RESULTADO ACTUALIZADO___________________");
        userList.forEach(System.out::println);
    }
}
