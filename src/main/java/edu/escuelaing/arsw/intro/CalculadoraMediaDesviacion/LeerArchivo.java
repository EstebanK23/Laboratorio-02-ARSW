package edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

public class LeerArchivo {
	
	public LeerArchivo() {}
	
	/**
	 * El metodo leerCarp es el encargado de leer todos los archivos de una carpeta
	 * ya que si se desea se puede y pasarlos a realizar el conteo de lineas
	 * 
	 * @param direccion es la ruta para la carpeta que se va a leer
	 * @param cont es el contador que llevara la suma de la cantidad de lineas de los archivos
	 **/
	public  void leerCarp(String direccion,Operaciones operacion) {


		File carpeta = new File(direccion);
		if (carpeta.isDirectory()) {
			File[] Lista = carpeta.listFiles();
			if (Lista == null || Lista.length == 0) {
			    System.out.println("No hay elementos dentro de la carpeta actual");
			    return;
			}
			else {
			    for (int i=0; i< Lista.length; i++) {
			    	System.out.println(Lista[i].getName());
			        if (Lista[i].isDirectory()) {
			        	leerCarp(direccion+'/'+Lista[i].getName(),operacion);
			        }
			        else {
			        	leerArch(direccion+'/'+Lista[i].getName(),operacion);
			        }
			    }
			}
		}
		else {
			leerArch(direccion,operacion);
		}
		
	}
	
	public double Casteo (String numero) {
		double NuevoNumero = Double.parseDouble(numero);
		return NuevoNumero;
	}
	
	/**
	 * El metodo leerArch es el encargado de leer el archivo para hacer el conteo de lineas
	 * 
	 * @param RutaAcceso es la ruta para el archivo que se va a leer
	 * @param cont es el contador que llevara la suma de la cantidad de lineas del archivo
	 **/
	public  void leerArch(String RutaAcceso,Operaciones operacion) {
		Charset caracter = Charset.forName("UTF-8");
		Path archivo = Paths.get(RutaAcceso);
		MyLinkedList Linked = new MyLinkedList();
		try (BufferedReader lector = Files.newBufferedReader(archivo, caracter)) {
            String linea = null;
            while ((linea = lector.readLine()) != null) {
            	
                double Numero = Casteo(linea);
                Linked.Agregar(Numero);
                //System.out.println("Lei el archivo " + Numero);
            }
            System.out.println("La media del archivo "+ archivo.getFileName() + " es: " + Math.round(operacion.OpMedia(Linked)*100)/100d);
            System.out.println("La desviacion estandar del archivo "+ archivo.getFileName() + " es: " + Math.round(operacion.OpDesviacion(Linked)*100)/100d);
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
		
	}

}
