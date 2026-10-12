package protocolo_individual.taller_5;
import protocolo_individual.taller_5.vehiculos.Moto;
import protocolo_individual.taller_5.vehiculos.Vehiculo;

public class PruebaTaller5 {

    public static void main(String[] args) {

        System.out.println("***Inicio del Programa***\n");

        //Clase Producto
        Producto producto = new Producto("Arroz",1750,25);
        producto.mostrarInfo();

        //Paquete vehiculos
        Vehiculo vehiculo = new Vehiculo("Carro");/*El constructor de Vehiculo tiene acceso de paquete*/
        Moto moto = new Moto();
        System.out.println("Se ha creado una moto correctamente\n");


        //Clase Persona
        Persona persona = new Persona("Paolo Trujillo",32);
        System.out.println("Primera persona: "+persona.getNombre());

        persona.setNombre("Chayanne Emilio");//Modificacion del valor del atributo nombre mediante el metodo set
        persona.edad=33;//Modificacion del valor del atributo edad
        persona.mostrarInfo();

    }
}

