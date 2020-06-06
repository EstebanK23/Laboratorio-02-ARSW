package edu.escuelaing.arsw.intro;

import edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion.LeerArchivo;

public class App {
	
	public static int ContadorFinal=0;
	
	/** 
	 * El metodo main tiene la tarea de llamar cada uno de los demas metodos
	 * para realizar el conteno de lineas e identificar si se tienen que leer
	 * las lineas fisicas o las lineas del codigo
	 * 
	 * @param args es una lista donde estara el tipo de lineas que se quieren
	 * consultar y tambien la direccion del archivo donde se va a consultar
	 **/
	
	public static void main( String[] args ){
		String ruta = args[0];
        LeerArchivo archivo= new LeerArchivo();  
        archivo.leerCarp(ruta);
           
    }
	
}
