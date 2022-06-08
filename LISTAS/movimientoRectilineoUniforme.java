package LISTAS;

public class movimientoRectilineoUniforme {
    private float velocidad;
    private float tiempo;

    public movimientoRectilineoUniforme(float velocidad, float tiempo){
        this.velocidad = velocidad;
        this.tiempo = tiempo;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
}
