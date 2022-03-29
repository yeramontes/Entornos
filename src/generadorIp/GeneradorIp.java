package generadorIp;

import java.util.Random;

public class GeneradorIp {
	private static final int MAX = 254;
	private static final int MIN = 0;
	
	public static int generarNumero() {
		Random rd = new Random();
		return rd.nextInt(MAX + 1);
	}
	
	public static String generarIp() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 4; i++) {
			int numero = generarNumero();
			if(i == 0 || i == 3) {
				while(numero == 0) {
					numero = generarNumero();
				}
			}
			sb.append(numero);
			if(i < 3) sb.append(".");
		}
		
		return sb.toString();
	}
}
