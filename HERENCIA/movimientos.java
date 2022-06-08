package HERENCIA;

public abstract class movimientos {
    protected float aceleracion;
    protected float distancia;
    protected float distanciaRecorrida;
    protected float velocidad;
    protected float tiempo;
    protected float velocidadInicial;
    protected float velocidadFinal;

    ///constructoor de la clase padre
    public movimientos(float tiempo) {
        this.tiempo = tiempo;
    }

    public void calcularDistanciaRecorrida(){
        this.distanciaRecorrida = this.velocidad * this.tiempo;
    }

    public void calcularAceleracion(){
        this.aceleracion = (this.velocidadFinal - this.velocidadInicial)/this.tiempo;
    }

    public void calcularDistancia(){
        this.distancia= ((this.velocidadInicial+this.velocidadFinal)/2) * this.tiempo;
    }

}
