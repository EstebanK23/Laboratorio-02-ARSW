package edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion;


public class MyLinkedList {
	Elemento fin = null;
	Elemento inicio;
	double size = 0;
	
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
	
	public double Sacar() {
		double saliente=(Double) null;
		if (fin != null) {
			saliente = inicio.numero;
			inicio = inicio.adelante;
		}
		size--;
		return saliente;
	}
	
	public double getSize() {
		return size;
	}
	
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
	
	public void print() {
		Elemento numero = inicio;
		while (numero!=null) {
			System.out.println(numero.numero+" ");
			numero=numero.adelante;	
		}
		System.out.println("");
	}
	
	
}
