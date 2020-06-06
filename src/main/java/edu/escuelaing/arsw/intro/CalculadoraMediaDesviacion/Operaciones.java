package edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion;

public class Operaciones {

	public double OpMedia(MyLinkedList Linked) {
        double Suma = 0;
        for(int i=0; i < Linked.getSize() ; i++){
            Suma += Linked.recorrer(i);
        }
        double Media = Suma / Linked.getSize();
        return Media;
    }
	
	public double OpDesviacion(MyLinkedList Linked) {
		double respuesta = 0, Resta = 0, media = OpMedia(Linked);
		for(int i=0; i < Linked.getSize() ; i++){
            Resta += Math.pow((Linked.recorrer(i)-media), 2);
        }
		respuesta = Math.sqrt(Resta/(Linked.getSize()-1));
		return respuesta;
	}
	
}
