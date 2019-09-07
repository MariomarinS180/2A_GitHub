import java.util.Scanner;

class TDACadenaEspecialConStringBuilder{
	private String cadena;
	
	public TDACadenaEspecialConStringBuilder(String cadenaEx) {
		this.setCadena(cadenaEx);
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public String invertirCadenaPorLetras() {
		StringBuilder builder = new StringBuilder(this.getCadena());
		builder.reverse();
		return builder.toString();
	}

	public String invertirCadenaPorPalabra() {
		String inversa ="";

		String palabra[] = this.getCadena().split(" ");

		for (int j = 0; j < palabra.length; j++) {
			inversa = palabra[j]+" "+inversa;
		}
		return inversa;
	}

	public String agregarCaracterEnPosicion(String caracter,int posicion) {
		StringBuilder builder = new StringBuilder(this.getCadena());
		builder.insert(posicion,caracter);
		return builder.toString();
	}

	public String agregarCadenaEnPosicion(String caracter,int posicion) {
		StringBuilder sb = new StringBuilder(this.getCadena());
		sb.insert(posicion,caracter);
		return sb.toString();
	}

}
public class Actividad2A{

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		TDACadenaEspecialConStringBuilder palabra = new TDACadenaEspecialConStringBuilder("INGENIERIA EN SISTEMAS");
		StringBuilder sCadena = new StringBuilder(palabra.getCadena());

		byte opc;
		do {
			
			System.out.println("Cadena: "+palabra.getCadena()+"\n¿Que desea realizar?");
			System.out.println("1) Invertir Cadena por Letras");
			System.out.println("2) Invertir Cadena por Palabras");
			System.out.println("3) Agregar un Caracter en una posición de la Cadena");
			System.out.println("4) Agregar un Palabra en una posición de la Cadena");
			System.out.println("5) Salir");
			System.out.print("Elige una opcion: ");
			opc = e.nextByte();

			switch (opc) {
			case 1: 
				System.out.println("==========================================================");
				
				System.out.println("invertido: "+sCadena.reverse());
				System.out.println("==========================================================\n");
				
			break;
			case 2: 
				
				System.out.println("==========================================================");
				String pal = palabra.invertirCadenaPorPalabra();
				
				System.out.println("INVERTIDO: "+pal);
				System.out.println("==========================================================\n");
				
			break;
			case 3: 
				
				System.out.println("==========================================================");
				
				System.out.println("Caracter a agregar: ");
				String caracter = e.next();
				
				System.out.println("Ingrese la Posición: ");
				int posicion = e.nextInt(); 
				System.out.println("Se agregó un Caracter a la Cadena.");
				System.out.println(palabra.agregarCaracterEnPosicion(caracter,posicion));
				System.out.println("==========================================================\n");
				
			break;
			case 4: 
				System.out.println("====================================================");
				System.out.println("Agrega la Cadena: ");
				String texto = e.next();
		
				System.out.println("Ingrese la Posición: ");
				int txt = e.nextInt(); 
				System.out.println("Se agregó el Texto a la Cadena.");
				System.out.println(palabra.agregarCaracterEnPosicion(texto,txt));
				System.out.println("==========================================================\n");
				
			break;
			case 5: break;
			default: System.out.println("Opcion incorrecta");break;
			}
		}while(opc != 5);
		System.out.println("Salió...");
	}//class
}//main