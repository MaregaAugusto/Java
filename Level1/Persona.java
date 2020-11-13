package Java.Level1;

public class Persona {
    
    private String nombre;
    private int edad;
    private String direccion;
    private String ciudad;

    public String getCiudad() {
        return ciudad;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, String direccion, String ciudad){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setDireccion(direccion);
        this.setCiudad(ciudad);
    }

    public String mostrar() {
        return this.getNombre()+"-"+this.getDireccion()+"-"+this.getEdad()+"-"+this.getCiudad();
    }

}
