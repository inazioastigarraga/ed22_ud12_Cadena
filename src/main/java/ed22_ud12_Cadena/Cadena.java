package ed22_ud12_Cadena;
	
public class Cadena {
	public int longitud(String cadena) {
		return cadena.length();
	}
	public int vocales(String cadena) {
		int cont=0;
		for(int i=0;i<cadena.length();i++) {
			 if ((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u')){ 
			    cont+=1;
			  }
		}
		return cont;
	}
	public String invertir(String cadena) {
		StringBuilder cadena2 = new StringBuilder(cadena);
		return cadena2.reverse().toString();
	}
	public int contarLetra(String cadena, char caracter) {
		int cont=0;
		for(int i=0;i<cadena.length();i++) {
			 if ((cadena.charAt(i)==caracter)) { 
			    cont+=1;
			  }
		}
		return cont;
	}
}


