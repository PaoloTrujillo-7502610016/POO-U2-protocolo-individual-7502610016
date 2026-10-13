package protocolo_individual.taller_6;

import protocolo_individual.taller_6.vehiculo.Moto;

public class PruebaTaller6 {

    public static void main(String[] args) {

        System.out.println("\n***Inicio del Programa***\n");

        Gerente gerente = new Gerente("Paolo Trujillo",5000000,"Administrativo");
        gerente.mostrarInformacion();

        Moto moto = new Moto("Moto", "Yamaha", 150);
        moto.mostrarInformacion();//No puede acceder a atributo protegido, clase Prueba no relacionada en paquete vehiculo

        Banco banco = new Banco(123456);//Instancia de la clase Banco
        System.out.println("Saldo: $"+banco.saldo);//Accede al atributo protected 'saldo' de la clase Banco.

    }
}




