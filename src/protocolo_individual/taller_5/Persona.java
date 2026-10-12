package protocolo_individual.taller_5;

public class Persona {
    private String nombre; //Atributo privado
    int edad; //Atributo del paquete (default)

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    String getNombre() {
        return nombre;
    }
    void setNombre(String nombre) {}

    void mostrarInfo(){
        System.out.println("Nombre: "+nombre+", Edad: "+edad+" años.");
    }

}
