package Java.Level1;

/**
 * Usuario
 */
public class Usuario {

    private String nombre;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre) {
        this.setNombre(nombre);
    }

    public String Saludar(){
        return ("Hola "+this.getNombre());
    }

}