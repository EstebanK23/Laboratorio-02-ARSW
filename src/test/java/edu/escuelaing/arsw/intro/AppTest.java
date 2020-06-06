package edu.escuelaing.arsw.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion.LeerArchivo;
import edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion.MyLinkedList;
import edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion.Operaciones;
import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
	
	/**
	 * Prueba encargada de confirmar que la media del archivo 1 esta bien calculada.
	 */
    public void testPrimerArchivoMedia(){
    	String [] ruta = {"src/test/resources/ArchivoPrueba1.txt"};
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
        assertTrue( Math.round(media.OpMedia(Linked)*100)/100d==550.6);
    }
    
    /**
     * Prueba encargada de confirmar que la desviacion estandar del archivo 1 esta bien calculada.
     */
    public void testPrimerArchivoDesviacion(){
    	String [] ruta = {"src/test/resources/ArchivoPrueba1.txt"};
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
		Operaciones desviacion = new Operaciones();
        assertTrue( Math.round(desviacion.OpDesviacion(Linked)*100)/100d==572.03);
    }
    
    /**
     * Prueba encargada de confirmar que la media del archivo 2 esta bien calculada.
     */
    public void testSegundoArchivoMedia(){
    	String [] ruta = {"src/test/resources/ArchivoPrueba2.txt"};
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
        assertTrue( Math.round(media.OpMedia(Linked)*100)/100d==60.32);
    }
    
    /**
     * Prueba encargada de confirmar que la desviacion estandar del archivo 2 esta bien calculada.
     */
    public void testSegundoArchivoDesviacion(){
    	String [] ruta = {"src/test/resources/ArchivoPrueba2.txt"};
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
		Operaciones desviacion = new Operaciones();
        assertTrue( Math.round(desviacion.OpDesviacion(Linked)*100)/100d==62.26);
    }
    
    /**
     * Prueba encargada de confirmar que la media del archivo 3 esta bien calculada.
     */
    public void testTercerArchivoMedia(){
    	String [] ruta = {"src/test/resources/ArchivoPrueba3.txt"};
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
        assertTrue( Math.round(media.OpMedia(Linked)*100)/100d==5.5);
    }
    
    /**
     * Prueba encargada de confirmar que la desviacion estandar del archivo 3 esta bien calculada.
     */
    public void testTercerPrimerArchivoDesviacion(){
    	String [] ruta = {"src/test/resources/ArchivoPrueba3.txt"};
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
		Operaciones desviacion = new Operaciones();
        assertTrue( Math.round(desviacion.OpDesviacion(Linked)*100)/100d==3.03);
    }
    
    /**
     * Prueba encargada de confirmar que la media del archivo 4 esta bien calculada.
     */
    public void testCuartoArchivoMedia(){
    	String [] ruta = {"src/test/resources/ArchivoPrueba4.txt"};
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
        assertTrue( Math.round(media.OpMedia(Linked)*100)/100d==335.79);
    }
    
    /**
     * Prueba encargada de confirmar que la desviacion estandar del archivo 4 esta bien calculada.
     */
    public void testCuartoArchivoDesviacion(){
    	String [] ruta = {"src/test/resources/ArchivoPrueba4.txt"};
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
		Operaciones desviacion = new Operaciones();
        assertTrue( Math.round(desviacion.OpDesviacion(Linked)*100)/100d==715.98);
    }
    
    /**
     * Prueba encargada de mostrar la media y la desviacion de todos los archivos.
     */
    public void testApp() {
		LeerArchivo archivo = new LeerArchivo();
		Operaciones calculadora = new Operaciones();
		archivo.leerCarp("src/test/resources", calculadora);
	}
}
