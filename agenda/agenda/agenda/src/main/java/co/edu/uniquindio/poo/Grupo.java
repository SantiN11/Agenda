package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Grupo {
    // Atributos de la clase Grupos
    private String nombre;
    private Categoria categoria;
    private LinkedList<Contacto> contactos;

    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public LinkedList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }
  

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void agregarContacto(Contacto contacto) {
        if (validarNombre(contacto.getNombre())) {
            Agenda.mostrarMensaje("Error!!! el contacto ya está registrado");
        } else {
            contactos.add(contacto);
        }
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
            if (contacto.getNombre().equals(nombre)) {
                contacto.setTelefono(telefono);
                contacto.setAlias(alias);
                break;
            }
        }

    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
   
    @Override
    public String toString() {
        return "------Grupos------ \n"+"nombre=" + nombre + ", categoria=" + categoria + ", contactos=" + contactos+" y la categoria es:" ;
    }

}
