package animales;

public class Gato extends Animal{

    Boolean tieneGarras;

    public Gato(String nombre, String color, double peso, double tamano, Boolean tieneGarras){
        super(nombre,color, peso, tamano);
        this.tieneGarras = tieneGarras;
    }

    public Gato(){}

    // Sobreescribimos el método moverse

    public String moverse(){
        return "El gato corre";
    }

    @Override
    public void comer() {

    }

}
