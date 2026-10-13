package protocolo_individual.taller_6;

public class Empleado {

    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {//Constructor con parametros
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Salario: $" + salario);
    }


}
