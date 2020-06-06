package edu.escuelaing.arsw.intro;

import edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion.LeerArchivo;
import edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion.Operaciones;

public class App {
	
	/** 
	 * El metodo main tiene la tarea de llamar cada uno de los demas metodos
	 * para realizar el calculo de la media y la desviacion estandar
	 * 
	 * @param args es una lista donde estara la direccion del archivo donde se va a consultar
	 **/
	
	public static void main( String[] args ){
		String ruta = args[0];
        LeerArchivo archivo= new LeerArchivo();  
        Operaciones operacion = new Operaciones();
        archivo.leerCarp(ruta,operacion);
           
    }
	
}
