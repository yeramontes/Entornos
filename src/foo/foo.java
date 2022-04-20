
package foo;
/**
 * @author Yera M
 * greet in different languages
 */
public class foo {

	/**
	 * Greets 
	 * @param lng chosen language
	 * @param rep how many times repeat greet
	 * @return a String with the greeting
	 */
	public String greet_method (int lng, int rep) {
		String resultado = "";
		String palabra = "";
		
		switch (lng) {
			case 0 : palabra = "hola";
					 break;
			case 1 : palabra = "hello";
					 break;
			case 2 : palabra = "kaixo";
			 		 break;
			 default:
				 	 break;	
		 }
		
		// Repeat greet as many as rep times
		for (int i = 0; i < rep; i++) {
			resultado += palabra;
		}
		
		return resultado;
	}
}
