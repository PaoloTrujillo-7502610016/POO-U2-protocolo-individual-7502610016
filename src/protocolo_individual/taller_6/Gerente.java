package protocolo_individual.taller_6;

public class Gerente extends Empleado{//Clase hija de la clase Empleado
    String departamento;


    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override //Se esta sobreescribiendo un metodo existente
    public void mostrarInformacion(){
        super.mostrarInformacion(); //Muestra los datos heredados del metodo de la clase padre
        System.out.println("Departamento: "+nombre); //Añade mas funcionalidad al metodo
    }

}
