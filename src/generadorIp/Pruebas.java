package generadorIp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Pruebas {

	@Test
	void testGenerarNumero() {
		for(int i = 0; i < 1000; i++) {
			int numero = GeneradorIp.generarNumero();
			assertTrue(numero >= 0 && numero <= 254);
		}
	}

	@Test
	void testGeneraIp() {
		String ip = GeneradorIp.generarIp();
		String[] numerosString = ip.split("\\.");
		int[] numeros = new int[numerosString.length];
		for(int i = 0; i < numerosString.length; i++) {
			numeros[i] = Integer.parseInt(numerosString[i]);
		}
		int primerNumero = numeros[0];
		int ultimoNumero = numeros[numeros.length - 1];
		assertTrue(primerNumero != 0 && ultimoNumero != 0);
	}
}
