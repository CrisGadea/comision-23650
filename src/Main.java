import animales.Delfin;
import animales.Gato;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*String nombre = "Cristian";
        int edadDeCristian = 26;
        final double ALTURA_CRISTIAN = 1.75;

        String dias [] = new String[7];
        dias[0] = "Domingo";
        dias[1] = "Lunes";
        dias[2] = "Martes";
        dias[3] = "Miércoles";
        dias[4] = "Jueves";
        dias[5] = "Viernes";
        dias[6] = "Sábado";


        // Mostrar unicamente los dias con índice impar con for
        for (int i = 0; i < dias.length; i++){
            if (i % 2 != 0) System.out.println(dias[i]);
        }

        // Mostrar unicamente los dias con índice impar con while
        int i  = 0;
        while(i < dias.length){
            if (i % 2 != 0) System.out.println(dias[i]);
            i++;
        }


//        System.out.println("Hola, me llamo " + nombre + ", tengo " + edadDeCristian +
//                " años, y mido: " + ALTURA_CRISTIAN + "m");

         */


        // CREACION DE ANIMALES
        Gato gatito = new Gato("Cleo", "negro", 2.0, 0.75, true);
        Delfin delfi = new Delfin();

        System.out.println("[Mi gatito lindo se llama " + gatito.getNombre() + "]");

        System.out.println(gatito.moverse());
        System.out.println(delfi.moverse());
    }
}