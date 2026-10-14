package protocolo_individual.taller_6;

public class Banco {
    protected double saldo; /*Dato sensible, no deberia ser protected*/

    //private double saldo; /*Atributo con acceso private + encapsulamiento

    public Banco(double saldo) {//Constructor
        this.saldo = saldo;
    }


    //Buena practica de encapsulamiento:

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {//Parametro es una variable local
        this.saldo = saldo; //El atributo recibe el valor de la variable local
    }

}
