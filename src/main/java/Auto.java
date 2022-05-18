package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		int i;
		int conteo = 0;
		for (i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				conteo ++;
			}
		}
		return conteo;
	}
	public String verificarIntegridad() {
		int i;
		int Testcode = registro;
		for (i = 0; i < asientos.length; i++) {
			Asiento Silla = asientos[i];
			if (Silla == null){
				continue;}
			if (Silla.registro != Testcode) {
				return "Las piezas no son originales";
			}
		}
		if (motor.registro != Testcode) {
			return "Las piezas no son originales";
		}
		return "Auto original";
	}
}