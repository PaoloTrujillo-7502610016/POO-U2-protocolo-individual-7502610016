package protocolo_individual.taller_5;

public class Persona {
    private String nombre; //Atributo privado
    int edad; //Atributo del paquete (default)

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    } //Metodo publico
    public void setNombre(String nombre) { //Metodo publico
        this.nombre = nombre;
    }

    void mostrarInfo(){
        System.out.println("Nombre: "+nombre+", Edad: "+edad+" años.");
    }

}
