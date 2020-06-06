package edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion;

public class Elemento {
	Elemento adelante;
	double numero;
	
	/**
	 * Metodo encargado de dar valor al elemento y al siguiente elemento
	 * 
	 * @param x Elemento que ingresa
	 **/
	public Elemento(double x) {
		numero = x;
		adelante = null;
	}
}
