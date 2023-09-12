package animales;

public abstract class Animal implements Movible, Comunicable{
    // Caracteristicas de un animal
    String nombre;
    String color;
    double peso;
    double tamano;

    // Definimos los métodos constructores
    public Animal(){}

    public Animal(String nombre, String color, double peso, double tamano) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.tamano = tamano;
    }

    // Metodos Getters y Setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    // Comportamientos de un animal

    // moverse

    public abstract void comer();
}
