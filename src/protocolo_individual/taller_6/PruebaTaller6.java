package protocolo_individual.taller_6;

import protocolo_individual.taller_6.vehiculo.Moto;

public class PruebaTaller6 {

    public static void main(String[] args) {

        System.out.println("\n***Inicio del Programa***\n");

        Gerente gerente = new Gerente("Paolo Trujillo",5000000,"Administrativo");
        gerente.mostrarInformacion();

        Moto moto = new Moto("Moto", "Yamaha", 150);
        //System.out.println("Tipo de vehiculo: "+moto.tipo);/*No puede acceder a atributo protegido, clase Prueba no relacionada en paquete vehiculo*/
        //System.out.println("Marca: "+moto.marca);/*No puede acceder a atributo protegido, clase Prueba no relacionada en paquete vehiculo*/
        moto.mostrarInformacion();//Si puede acceder al metodo publico, el cual muestra los valores de los atributos


        Banco banco = new Banco(123456);//Instancia de la clase Banco
        System.out.println("Saldo: $"+banco.saldo);//Accede al atributo protected 'saldo' -Modo no recomendado-
        System.out.println("Saldo: $"+banco.getSaldo()); //Accede al atributo desde el metodo getter -Modo Correcto con acceso private + encapsulamiento-

    }
}




