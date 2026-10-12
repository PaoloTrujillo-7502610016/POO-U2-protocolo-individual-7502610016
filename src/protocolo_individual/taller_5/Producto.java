package protocolo_individual.taller_5;

class Producto { //Clase del Producto con nivel de acceso de paquete
    String nombre; //Por defecto, tiene acceso default
    double precio; //Por defecto, tiene acceso default
    int stock; //Por defecto, tiene acceso default

    Producto(String nombre, double precio, int stock) { //Constructor con acceso de paquete
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo(){ //Metodo con acceso de paquete
        System.out.println("Nombre del Producto: "+nombre+"\nPrecio: $"+precio+"\nStock: "+stock);
    }

}
