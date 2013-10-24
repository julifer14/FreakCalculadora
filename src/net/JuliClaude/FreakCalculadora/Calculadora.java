package net.JuliClaude.FreakCalculadora;

import java.util.Scanner;

public class Calculadora {
	/*
	 * Calculadora xaxi guai que no serveix per a res. Plena de bugs!
	 * 
	 */
	Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Operacions operar = new Operacions();
		float num1 = 0;
		float num2 = 0;
		int opcio = 0;
		float res = 0;
		boolean sortir = false;
		String numBinari = "";
		float num = 0;
		while (!sortir) {

			System.out.println("Indica quina operació vols realitzar");
			System.out.println("1- Sumar");
			System.out.println("2-Restar");
			System.out.println("3-Dividir");
			System.out.println("4-Multiplicar");
			System.out.println("5-Eliminar");
			System.out.println("6-Convertir a binari");
			System.out.println("7- Sortir");
			opcio = lector.nextInt();

			if (opcio >= 1 && opcio <= 5) {
				System.out.println("Indica amb quins números vols operar");
				num1 = operar.demanarNumero();
				num2 = operar.demanarNumero();
			} else if (opcio == 6) {
				System.out.println("Indica quin número vols passar a binari");
				num = operar.demanarNumero();
			}
			switch (opcio) {
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
			case 6:
				numBinari = operar.retornaBinari(num);
				break;
			case 7:
				sortir = true;
				break;
			default:
				System.out.println("Operació no vàlida BURRO!");
				break;
			}
			
			if (opcio < 6) {
				System.out.println("El resultat de la operació és " + res);
			} else if(opcio == 6) {
				System.out.println("El resultat de la operació és " + numBinari);
			}else{
				System.out.println("Fins aviat!");
			}
		}
	}
}
