package protocolo_individual.taller_6;

import protocolo_individual.taller_6.vehiculo.Moto;
import protocolo_individual.taller_6.vehiculo.Vehiculo;

public class PruebaTaller6 {

    public static void main(String[] args) {

        System.out.println("\n***Inicio del Programa***\n");

        Gerente gerente = new Gerente();
        gerente.nombre = "Paolo Trujillo";
        gerente.salario = 5000000;
        gerente.departamento = "Administrativo";
        gerente.mostrarInfo();

        Moto moto = new Moto();
//        moto.tipo = "Moto"; //No puede acceder a atributo protegido, clase Prueba no relacionada en paquete vehiculo
//        moto.marca = "Yamaha"; //No puede acceder a atributo protegido, clase Prueba no relacionada en paquete vehiculo
//        moto.cilindrada = 150; //No puede acceder a atributo protegido, clase Prueba no relacionada en paquete vehiculo

        Banco banco = new Banco(123456);//Instancia de la clase Banco
        System.out.println("Saldo: $"+banco.saldo);//Accede al atributo protected 'saldo' de la clase Banco.

    }
}




