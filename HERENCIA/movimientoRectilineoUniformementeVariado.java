package HERENCIA;

public class movimientoRectilineoUniformementeVariado extends movimientos{
    public movimientoRectilineoUniformementeVariado(float tiempo, float velocidadInicial, float velocidadFinal) {
        super(tiempo);
        this.velocidadInicial = velocidadInicial;
        this.velocidadFinal = velocidadFinal;
        this.calcularAceleracion();
        this.calcularDistancia();
    }
    public float getAceleracion() {
        return this.aceleracion;
    }
    public float getDistancia(){
        return this.distancia;
    }

}
