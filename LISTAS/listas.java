package LISTAS;

import java.util.ArrayList;

public class listas {
    ArrayList<movimientoRectilineoUniforme> valores= new ArrayList<>();

    public void agregarValores(){
        valores.add(new movimientoRectilineoUniforme(30,50));
        valores.add(new movimientoRectilineoUniforme(60,80));
        valores.add(new movimientoRectilineoUniforme(13,14));
        valores.add(new movimientoRectilineoUniforme(58,12));
    }
    public void mostrarDatos(){
        System.out.println("velocidad \t tiempo");

        for (int i = 0; i < valores.size(); i++){
            System.out.println(String.format(valores.get(i).getVelocidad() + "\t\t" + valores.get(i).getTiempo()));
        }
        ///valores.forEach((n) -> System.out.println(String.format(n.getVelocidad() + "\t\t" + n.getTiempo())));
    }
     public static void main (String arg[]){
        listas movs = new listas();
        movs.agregarValores();
        movs.mostrarDatos();
     }
}




