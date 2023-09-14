public class Calculadora {

    static class ClaseAnidada{
        void mostrarMensaje(){
            System.out.println("Mensaje desde clase anidada");
        }
    }

    public static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static int resta(int numero1, int numero2){
        return numero1 - numero2;
    }

    public static int multiplicacion(int numero1, int numero2){
        return numero1 * numero2;
    }

    public static int division(int numero1, int numero2){
        return numero1 / numero2;
    }
}
