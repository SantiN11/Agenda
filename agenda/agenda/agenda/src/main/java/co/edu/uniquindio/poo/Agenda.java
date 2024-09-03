package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

public class Agenda {
    private LinkedList<Contacto> contactos;
    private LinkedList<Grupo> grupos;
    private LinkedList<Reunion> reuniones;

    public Agenda() {
        this.contactos = new LinkedList<>();
        this.grupos = new LinkedList<>();
        this.reuniones = new LinkedList<>();
    }

    public LinkedList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public LinkedList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(LinkedList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public LinkedList<Reunion> getReuniones() {
        return reuniones;
    }

    public void setReuniones(LinkedList<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    // Agregar Contacto

    public void agregarContacto(Contacto contacto) {
        if (validarNombre(contacto.getNombre()) || validarTelefono(contacto.getTelefono())) {
            Agenda.mostrarMensaje("Error!!! el contacto ya está registrado");
        } else {
            contactos.add(contacto);
        }
    }
    public void agregarGrupo(Grupo grupo) {
        if (validarNombre(grupo.getNombre())) {
            Agenda.mostrarMensaje("Error!!! el Grupo ya está registrado");
        } else {
            grupos.add(grupo);
            System.out.println("El grupo tiene 5 contactos");
        }
    }

//metodo para agregar reunion
    public void agregarReunion(Reunion reunion) {
        if (validarNombre(reunion.getDescripcion())) {
            Agenda.mostrarMensaje("Error!!! La reunion ya está registrada");
        } else {
            reuniones.add(reunion);
        }
    }

    public void eliminarReunion(Reunion reunion) {
        reuniones.remove(reunion);
    }
    public void eliminarGrupo(Grupo grupo) {
        grupos.remove(grupo);
    }

    // Validar que no haya contacto repetido por el nombre

    public boolean validarNombre(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    // Validar que no haya contacto repetido por el telefono

    public boolean validarTelefono(String telefono) {
        for (Contacto contacto : contactos) {
            if (contacto.getTelefono().equals(telefono)) {
                return true;
              
            }
        }  
        return false;
        
    }

    public void eliminarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                contactos.remove(contacto);
                break;
            }
        }

    }

    public void actualizarContacto(String nombre, String telefono, String alias) {
        for (Contacto contacto : contactos) {
            if (contacto.getAlias().equals(alias)) {
                contacto.setTelefono(telefono);
                contacto.setNombre(nombre);
                break;
            }
        }
    

    }
    public void actualizarReunion(String descripcion, LocalDate fecha , LocalTime hora) {
        for (Reunion reunion : reuniones) {
            if (reunion.getDescripcion().equals(descripcion)) {
                reunion.setFecha(fecha);
                reunion.setHora(hora);
                break;
            }
        }
    }

    public void actualizarGrupo(String nombre) {
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().equals(nombre)) {
                break;
            }
        }
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "------Agenda------ \n"+"contactos=" + contactos + "\n" + grupos + "\n reuniones=" + reuniones ;
    }

}
