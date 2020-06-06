package edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion;

public class Operaciones {
	
	/**
	 * El metodo de OpMedia es el encargado de calcular la media del LinkedList
	 * 
	 * @param Linked es el LinkedList que se pasa para calular la media
	 * 
	 * @return double Media del LinkedList
	 **/
	public double OpMedia(MyLinkedList Linked) {
        double Suma = 0;
        for(int i=0; i < Linked.getSize() ; i++){
            Suma += Linked.recorrer(i);
        }
        double Media = Suma / Linked.getSize();
        return Media;
    }
	
	/**
	 * El metodo de OpDesviacion es el encargado de calcular la desviacion estandar del LinkedList
	 * 
	 * @param Linked es el LinkedList que se pasa para calular la desviacion estandar
	 * 
	 * @return double Desviacion estandar del LinkedList
	 **/
	public double OpDesviacion(MyLinkedList Linked) {
		double respuesta = 0, Resta = 0, media = OpMedia(Linked);
		for(int i=0; i < Linked.getSize() ; i++){
            Resta += Math.pow((Linked.recorrer(i)-media), 2);
        }
		respuesta = Math.sqrt(Resta/(Linked.getSize()-1));
		return respuesta;
	}
	
}
