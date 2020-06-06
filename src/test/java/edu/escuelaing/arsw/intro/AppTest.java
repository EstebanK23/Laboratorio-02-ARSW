package edu.escuelaing.arsw.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion.MyLinkedList;
import edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion.Operaciones;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{

    public void testPrimerArchivoMedia(){
    	String [] ruta = {"src/test/resources/Archivo de prueba1.txt"};
    	Charset caracter = Charset.forName("UTF-8");
		Path archivo = Paths.get(ruta[0]);
		MyLinkedList Linked = new MyLinkedList();
		try (BufferedReader lector = Files.newBufferedReader(archivo, caracter)) {
            String linea = null;
            while ((linea = lector.readLine()) != null) {
            	
                double Numero = Double.parseDouble(linea);;
                Linked.Agregar(Numero);
            }

        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
		Operaciones media = new Operaciones();
        assertTrue( media.OpMedia(Linked)==550.6);
    }
}
