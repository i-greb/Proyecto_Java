package HERENCIA;

public class mainHerencia {
    public static void main(String[] args){
        System.out.println("Distancia Recorrida");
        movimientoRectilineoUniforme resultado = new movimientoRectilineoUniforme(10,30);
        System.out.println(resultado.getDistanciaRecorrida());

        System.out.println("Aceleración y Distancia");
        movimientoRectilineoUniformementeVariado resultado2 = new movimientoRectilineoUniformementeVariado(20,50,100);
        System.out.println(resultado2.getAceleracion());
        movimientoRectilineoUniformementeVariado resultado3 = new movimientoRectilineoUniformementeVariado(20,50,100);
        System.out.println(resultado3.getDistancia());
    }
}
