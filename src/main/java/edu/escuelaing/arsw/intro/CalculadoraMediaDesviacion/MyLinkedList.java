package edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion;

/** Implementacion de mi LinkedList **/

public class MyLinkedList {
	Elemento fin = null;
	Elemento inicio;
	double size = 0;
	
	/** 
	 * El metodo de Agregar es el encargado de agregar cada elemento al linkedList
	 * 
	 * @param numero sera el elemento a agregar al LinkedList
	 **/
	
	public void Agregar(double numero) {
		Elemento entrante = new Elemento(numero);
		if (inicio != null) {
			fin.adelante = entrante;
			fin = entrante;
		}
		else {
			inicio = entrante;
			fin = entrante;
		}
		size++;
		//System.out.println("Agregue");
		//print();
	}
	
	/** 
	 * El metodo de Sacar es el encargado de sacar el ultimo elemento del linkedList
	 * 
	 * @return double numero eliminado del LinkedList
	 **/
	public double Sacar() {
		double saliente=(Double) null;
		if (fin != null) {
			saliente = inicio.numero;
			inicio = inicio.adelante;
		}
		size--;
		return saliente;
	}
	
	/**
	 * El metodo de getSize es el encargado de dar el tamaño del LinkedList
	 * 
	 * @return double tamaño del LinkedList
	 **/
	public double getSize() {
		return size;
	}
	
	/**
	 * El metodo de recorrer es el encargado retornar el numero que este en la posicion indicada del LinkedList
	 * 
	 * @param pos es la posicion del numero que se quiere obtener del LinkedList
	 * 
	 * @return double numero especificado del LinkedList
	 **/
	public double recorrer(int pos) {
		Elemento numero = inicio;
		double numeroDefinitivo=0;
		double size = getSize();
		if (pos<0 || pos>=size) {
			return numeroDefinitivo;
		}
		else {
			for(int i=0;i<pos;i++) {
				//System.out.println("Entre");
				numero=numero.adelante;
			}
		}
		
		numeroDefinitivo=numero.numero;
		return numeroDefinitivo;
	}
	
	/**
	 * Metodo implementado para imprimir el LinkedList
	 **/
	public void print() {
		Elemento numero = inicio;
		while (numero!=null) {
			System.out.println(numero.numero+" ");
			numero=numero.adelante;	
		}
		System.out.println("");
	}
	
	
}
