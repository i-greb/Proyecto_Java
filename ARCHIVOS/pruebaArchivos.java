package ARCHIVOS;

import java.io.*;
import java.util.ArrayList;

public class pruebaArchivos {

    private ArrayList<String> contenidoArchivo = new ArrayList<>();
    private ArrayList<calcularDistancia> listaEntrada = new ArrayList<>();
    private final String rutaWindows = "C:/Users/hermi/OneDrive/Escritorio/IntelliJ/src/ARCHIVOS/valores.txt";
    //private final String rutaLinux = "" + "";

    public ArrayList<String> getContenidoArchivo() {
        return contenidoArchivo;
    }

    public ArrayList<calcularDistancia> getListaEntrada() {
        return listaEntrada;
    }

    public void leerArchivo(){
        LeerArchivo leer = new LeerArchivo();
        this.contenidoArchivo =
                leer.leerArchivo(this.rutaWindows);
        for (int i=0; i < this.contenidoArchivo.size();i++){
            String linea = this.contenidoArchivo.get(i);
            String elementosLinea[] = linea.split("-");
            try {
                float velocidad = Float.parseFloat(elementosLinea[0]);
                float tiempo = Float.parseFloat(elementosLinea[1]);
                listaEntrada.add(new calcularDistancia(velocidad, tiempo));
            } catch (NumberFormatException ex){
                ex.printStackTrace();
                listaEntrada.add(new calcularDistancia(0,0));
            }
        }
    }

    public void escribirArchivo(ArrayList<calcularDistancia> lista){
        String archivo = "resultados.csv";
        File f = new File(archivo);
        //Escritura
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("Velocidad - Tiempo - Distancia Recorrida \n");
            for (int i=0; i < lista.size(); i++){
                wr.append(lista.get(i).getVelocidad() + "\t" +"\t" +
                        " " + lista.get(i).getTiempo() + "\t" +
                        " " + lista.get(i).getDistanciaRecorrida() + "\n");
            }
            wr.close();
            bw.close();
        }
        catch(IOException e){

        }
    }

    public static void main (String args[]){
        pruebaArchivos prueba = new pruebaArchivos();
        prueba.leerArchivo();
        for (int i=0; i < prueba.getListaEntrada().size(); i++){
            System.out.println(prueba.getListaEntrada().get(i).getVelocidad() +
                    "\t" + prueba.getListaEntrada().get(i).getTiempo() +
                    "\t" + prueba.getListaEntrada().get(i).getDistanciaRecorrida());
        }
        prueba.escribirArchivo(prueba.getListaEntrada());

    }
}