package animales;

public class Gato extends Animal implements Comunicable{

    static{
        System.out.println("Se cargó la clase Gato");
    }

    private Boolean tieneGarras;

    public static int cantGatos;

    public Gato(String nombre, String color, double peso, double tamano, Boolean tieneGarras){
        this.tieneGarras = tieneGarras;
        cantGatos++;
    }

    public Gato(){
        cantGatos++;
    }

    // Sobreescribimos el método moverse

    public String moverse(){
        return "El gato corre";
    }


    public void comer() {

    }


    public void enviarMensaje(String mensaje, Comunicable receptor) {

    }


    public void recibirMensaje(String mensaje, Comunicable emisor) {

    }
}
