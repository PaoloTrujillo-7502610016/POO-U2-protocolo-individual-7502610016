import protocolo_individual.taller_4.Coche;
import protocolo_individual.taller_4.Estudiante;

public static void main(String[] args) {

    System.out.println("***Inicio del Programa***");

    System.out.println("\nSeleccione uno de los programas:");
    System.out.println("1. Programa Estudiante");
    System.out.println("2. Programa Coche");
    System.out.println("3. Otro");
    Scanner entrada = new Scanner(System.in);
    int opcion = entrada.nextInt();

    if(opcion<1 || opcion>3){
        System.out.println("Opción no valida. Fin del Programa");
    }else {
        switch (opcion) {
            case 1:
                System.out.println("Haz seleccionado la opcion "+opcion+":");
                Estudiante estudiante = new Estudiante("Paolo Trujillo",32,4.5);
                System.out.println("Nombre del Estudiante: "+estudiante.getNombre());
                //System.out.println("Nombre del Estudiante: "+estudiante.nombre);/*Codigo con error*/
                System.out.println("Edad: "+estudiante.getEdad());
                //System.out.println("Nombre del Estudiante: "+estudiante.edad);/*Codigo con error*/
                System.out.println("Nota promedio: "+estudiante.getNotaPromedio());
                estudiante.setNotaPromedio(4.8);/*Modifica el valor del atributo notaPromedio*/
                estudiante.mostrarNuevaNota();
                break;

            case 2:
                System.out.println("Haz seleccionado la opcion "+opcion+":");
                Coche coche = new Coche("Toyota","LandCruiser 1985",80);
                System.out.println("Vehiculo: "+coche.getMarca());
                System.out.println("Modelo: "+coche.getModelo());
                System.out.println("Velocidad Máxima: "+coche.getVelocidadMaxima()+" km/h");
                coche.aumentarVelocidad(50);/*Metodo que modifica el valor del atributo velocidadMaxima*/
                break;

            case 3:
                System.out.println("Haz seleccionado la opcion "+opcion+":");

                break;
        }
    }


}
