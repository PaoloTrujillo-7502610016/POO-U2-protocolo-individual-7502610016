package protocolo_individual.taller_6;

public class Gerente extends Empleado{//Clase hija de la clase Empleado
    String departamento;

    public Gerente(){
        super();//Invoca el contructor de la clase padre
    }

    public void mostrarInfo(){
        System.out.println("Nombre del empleado: "+nombre);
        System.out.println("Salario: $"+salario);
        System.out.println("Departamento: "+departamento);
    }

}
