package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

//Atributos de la clase Reunion

public class Reunion {
    private String descripcion;
    private LocalDate fecha;
    private LocalTime hora;
    private LinkedList<Contacto> asistentes;
    

    public Reunion(String descripcion, LocalDate fecha, LocalTime hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.asistentes = new LinkedList<>();

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }


    @Override
    public String toString() {
        return "------Reuniones------\n"+ descripcion + ", fecha=" + fecha + ", hora=" + hora + "\n" + asistentes;
    }

    public void agregarContacto(Contacto contacto) {
        if (validarNombre(contacto.getNombre())) {
            Agenda.mostrarMensaje("Error!!! el contacto ya está registrado");
        } else {
            asistentes.add(contacto);
        }
    }

    public void eliminarContacto(String nombre) {
        for (Contacto contacto : asistentes) {
            if (contacto.getNombre().equals(nombre)) {
                asistentes.remove(contacto);
                break;
            }
        }

    }

    public void actualizarContacto(String nombre, String telefono, String alias) {
        for (Contacto contacto : asistentes) {
            if (contacto.getNombre().equals(nombre)) {
                contacto.setTelefono(telefono);
                contacto.setAlias(alias);
                break;
            }
        }

    }
    public boolean validarNombre(String nombre) {
        for (Contacto contacto : asistentes) {
            if (contacto.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public LinkedList<Contacto> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(LinkedList<Contacto> asistentes) {
        this.asistentes = asistentes;
    }
}
