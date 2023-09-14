package animales;

public interface Comunicable {
    void enviarMensaje(String mensaje, Comunicable receptor);
    void recibirMensaje(String mensaje, Comunicable emisor);
}
