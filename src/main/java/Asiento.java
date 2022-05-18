
package test;

import java.util.Arrays;


public class Asiento {
	String color;
	int precio;
	int registro;
	
	public void cambiarColor(String color) {
		String[] ColoresAceptados = {"rojo","verde","amarillo","negro","blanco"};
		if (Arrays.asList(ColoresAceptados).contains(color)) {
			this.color = color;
		}
	}
}