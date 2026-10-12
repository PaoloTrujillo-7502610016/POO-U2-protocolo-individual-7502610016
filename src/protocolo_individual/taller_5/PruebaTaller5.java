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
        Vehiculo vehiculo = new Vehiculo("Carro");
        Moto moto = new Moto();


        //Clase Persona
        Persona persona = new Persona("Paolo Trujillo",32);
        persona.mostrarInfo();

    }
}

