package protocolo_individual.taller_6.vehiculo;

public class Moto extends Vehiculo {
    int cilindrada;

    public Moto(String tipo, String marca, int cilindrada){
        super(tipo, marca);//Invoca el contructor de la clase Vehiculo
        this.cilindrada = cilindrada;
    }

    public void mostrarInformacion(){
        System.out.println("Tipo: "+tipo);
        System.out.println("Marca: "+marca);
        System.out.println("Cilindrada: "+cilindrada);
    }
}
