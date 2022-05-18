package test;
import java.util.Arrays;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	public void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	public void asignarTipo(String tipo) {
		String[] TiposAceptados = {"electrico","gasolina"};
		if (Arrays.asList(TiposAceptados).contains(tipo)) {
			this.tipo = tipo;
		}
	}
}