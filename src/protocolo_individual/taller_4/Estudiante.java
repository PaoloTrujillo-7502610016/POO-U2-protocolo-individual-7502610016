package protocolo_individual.taller_4;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100) {/*La edad debe estar en un rango de 1 a 100*/
            this.edad = edad;
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }
    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

    public void mostrarNuevaNota(){
        System.out.println("Nueva nota Promedio: "+notaPromedio);
    }

}
