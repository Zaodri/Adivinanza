package adivinanza;

import java.util.Scanner;

public class AdivinandoNumero {
	
	public static void main( String [] args) {
		
		System.out.println("***** ¡ADIVINA QUE NÚMERO SE ESCONDE! ****");
		
		//Creamos objeto de tipo Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Generamos número secreto
		final int NUM_SECRET = 27;
		int num_secret = (int)(Math.random() * 101);
		
		//Solicitamos número a usuario
		System.out.println("Piensa en un número que no sea mayor a 100 y escribelo por favor ");
		num_secret = entrada.nextInt();
		
		//Evaluamos respuesta
		if (num_secret == NUM_SECRET) {
			System.out.println("Adivinaste el número ¡Felicitaciones!");			
		}
		
		if (num_secret < 27) {
			System.out.println("¡Frio!");
		}else {
				if ((num_secret >= 28) && (num_secret <= 100)) {  // En una condición, si queremos poner topes para que no se impriman 2 títulos o condiciones
					System.out.println("¡Caliente!");           // utilizamos los operadores aritméticos, ejemplo: && ||
				}
			}
		
		if (num_secret >=101) {
			System.out.println("Número fuera de rango. ");			
		}
		
	}

}
