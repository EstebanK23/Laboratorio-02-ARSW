package edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion;

public class Elemento {
	Elemento adelante;
	double numero;
	
	public Elemento(double x) {
		numero = x;
		adelante = null;
	}
}
