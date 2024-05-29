package com.pc;

import com.pc.datos.*;
import com.pc.entidad.Persona;
import com.pc.entidad.Usuario;

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

        UsuarioDAO usuarioDao = new UsuarioDAO();

        usuarioDao.insert(new Usuario("amidamaru", "gft565@fdf"));

        List<Usuario> usuarioList = usuarioDao.seleccionar();

        usuarioList.forEach(System.out::println);
    }
}
