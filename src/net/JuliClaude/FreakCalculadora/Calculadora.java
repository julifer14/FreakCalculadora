package net.JuliClaude.FreakCalculadora;

import java.util.Scanner;

public class Calculadora {
	/*
	 * Calculadora xaxi guai que no serveix per a res. Plena de bugs!
	 */
	Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Operacions operar = new Operacions();
		float num1 = 0;
		float num2 = 0;
		int opcio = 0;
		int opcioInterna = 0;
		float res = 0;
		boolean sortir = false;
		String numBinari = "";
		float num = 0;
		while (!sortir) {

			System.out.println("Indica quina operaci� vols realitzar");
			System.out.println("1- Operacions");
			System.out.println("2-Convertir a binari");
			System.out.println("3- Sortir");
			opcio = lector.nextInt();

			switch (opcio) {
			case 1:
				System.out.println("Indica quina operaci� vols realitzar");
				System.out.println("1- Sumar");
				System.out.println("2-Restar");
				System.out.println("3-Dividir");
				System.out.println("4-Multiplicar");
				System.out.println("5-Eliminar");
				System.out.println("Indica quina operació vols fer");
				opcioInterna = lector.nextInt();

				System.out.println("Insereix els números amb què vols operar");
				num1 = lector.nextFloat();
				num2 = lector.nextFloat();

				switch (opcioInterna) {
				case 1:
					res = operar.suma(num1, num2);
					break;

				case 2:
					res = operar.resta(num1, num2);
					break;

				case 3:
					res = operar.divisio(num1, num2);
					break;

				case 4:
					res = operar.multiplicacio(num1, num2);
					break;

				case 5:
					operar.esborrarNumeros(num1, num2);
					break;

				}
				if (opcioInterna != 5) {
					System.out.println("El resultat de la operació es " + res);
				}
			case 2:
				num = operar.demanarNumero();
				numBinari = operar.retornaBinari(num);
				break;
			case 3:
				sortir = true;
				break;
			default:
				System.out.println("Operaci� no v�lida BURRO!");
				break;
			}
			if (opcio == 2) {
				System.out
						.println("El resultat de la operaci� �s " + numBinari);
			} else if (opcio == 3) {
				System.out.println("Fins aviat!");
			}
		}
	}
}
