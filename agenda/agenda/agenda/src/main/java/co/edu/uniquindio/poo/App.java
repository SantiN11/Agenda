package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // Agregar contactos
        Contacto contacto = new Contacto("Luisa", "Fernanda", "Granada", "123", "luisa@");
        Contacto contacto1 = new Contacto("juan jose", "Joselito", "Granada", "152", "luisa@");
        Contacto contacto2 = new Contacto("Sebastian", "Sebas", "Granada", "1423", "luisa");
        Contacto contacto3 = new Contacto("Jose", "Manuel", "Granada", "13", "luisa");
        Contacto contacto4 = new Contacto("Santiago", "Santi", "Granada", "23", "luisa");

        Agenda agenda = new Agenda();

        agenda.agregarContacto(contacto);
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);
        agenda.agregarContacto(contacto3);
        agenda.agregarContacto(contacto4);

        String alias = "Joselito";
        agenda.actualizarContacto("JoseM", "31281923272", alias);
        Agenda.mostrarMensaje("El estudiante " + alias + " ha sido actualizado");

        // Se crea un grupo y se agregan los contactos al grupo
        Grupo grupos = new Grupo("Progamacion 1", Categoria.ADMINISTRATIVA);
        Grupo grupos1 = new Grupo("Progamacion 1", Categoria.QUEJAS);

        agenda.agregarGrupo(grupos1);
        agenda.agregarGrupo(grupos);

        grupos.agregarContacto(contacto);
        grupos.agregarContacto(contacto1);
        grupos.agregarContacto(contacto2);
        grupos.agregarContacto(contacto3);
        grupos.agregarContacto(contacto4);

        // Eliminar reuniones
        agenda.eliminarGrupo(grupos1);

        grupos.eliminarContacto("Jose");
        Grupo.mostrarMensaje("El contacto ha sido eliminado");

        // Estos datos van antes de darle fecha y hora a la clase reunion
        LocalDate fechaActual = LocalDate.of(2024,9,3);
        LocalTime hora = LocalTime.of(11,11);

        // Se crea una reunion y se agregan los asistentes
        Reunion reunion = new Reunion("Reunion Taller", fechaActual, hora);
        Reunion reunion2 = new Reunion("Reunion Entrega", fechaActual, hora);
        agenda.agregarReunion(reunion);
        agenda.agregarReunion(reunion2);
        // Asistentes
        reunion.agregarContacto(contacto3);
        reunion.agregarContacto(contacto4);

        // Eliminar contacto de la reunion
        reunion.eliminarContacto("Santiago");
        Agenda.mostrarMensaje(agenda.toString());
        // Agenda.mostrarMensaje(agenda.toString());

        
    }
}
