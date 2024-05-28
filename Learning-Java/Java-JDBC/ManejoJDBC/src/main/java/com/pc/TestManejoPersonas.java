package com.pc;

import com.pc.datos.PersonaDAO;
import com.pc.entidad.Persona;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        List<Persona> personaList = personaDAO.selection();
        System.out.println("________________Resultado_______________");

        personaList.forEach(System.out::println);

        int registros = personaDAO.insertar(new Persona("Brenda", "Sagastegui", "bsagastegui@gmail.com",
                "988888745"));

        System.out.println("______________Resultado 2________________");
        personaList.forEach(System.out::println);
    }
}
