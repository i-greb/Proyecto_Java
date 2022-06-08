package HERENCIA;

public class movimientoRectilineoUniforme extends movimientos {

    public movimientoRectilineoUniforme(float tiempo, float velocidad) {
        super(tiempo);
        this.velocidad = velocidad;
        this.calcularDistanciaRecorrida();

    }
    public void calcularDistanciaRecorrida(){
        this.distanciaRecorrida= this.velocidad * this.tiempo;}

    public float getDistanciaRecorrida(){
        return this.distanciaRecorrida;
    }

}

