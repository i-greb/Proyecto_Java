package ARCHIVOS;

public class calcularDistancia {
    private float distanciaRecorrida = 0;
    private float velocidad = 0;
    private float tiempo = 0;

    public calcularDistancia(float velocidad, float tiempo) {
        this.velocidad = velocidad;
        this.tiempo = tiempo;
        this.calcularDistanciaRecorrida();
    }



    public float getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(float distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
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



    public void calcularDistanciaRecorrida(){
        distanciaRecorrida = this.velocidad + this.tiempo;
    }

}
