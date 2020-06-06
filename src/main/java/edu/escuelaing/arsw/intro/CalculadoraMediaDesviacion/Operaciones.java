package edu.escuelaing.arsw.intro.CalculadoraMediaDesviacion;

import java.util.List;

public class Operaciones {

	public double OpMedia(MyLinkedList Lista) {
        double Suma = 0;
        for(int i=0; i < Lista.getSize() ; i++){
            Suma += Lista.recorrer(i);
        }
        double Media = Suma / Lista.getSize();
        return Media;
    }
	
}
