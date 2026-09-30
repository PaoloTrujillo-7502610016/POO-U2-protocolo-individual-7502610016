package protocolo_individual.taller_4;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima > 0){
            this.velocidadMaxima = velocidadMaxima;
        }else {System.out.println("La velocidad maxima debe ser mayor a 0");}
    }

    public int acelerar(int incremento)
    {if (incremento > 0) {
        velocidadMaxima += incremento;
        System.out.println("Ha tenido un aumento de "+incremento+" km. Ahora la nueva velocidad máxima es de "+velocidadMaxima+" km/h");
    }else
        System.out.println("No se puede aumentar la velocidad");
        return velocidadMaxima;
    }

}
