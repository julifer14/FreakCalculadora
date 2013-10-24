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
		Calculadora c = new Calculadora();
		float num1 = c.demanarNumero();
		float num2 = c.demanarNumero();
		int opcio = 0;
		System.out.println("Indica quina operació vols realitzar");
		System.out.println("1- Sumar");
		System.out.println("2-Restar");
		System.out.println("3-Dividir");
		System.out.println("4-Multiplicar");
		System.out.println("5-Convertir a binari");
		opcio = lector.nextInt();
		switch (opcio) {
		case 1:
			operar.suma(num1, num2);
			break;

		default:
			break;
		}
	}

	public float demanarNumero() {
		// Scanner lector = new Scanner(System.in);
		System.out.println("Escriu un número");
		float numero = lector.nextFloat();
		return numero;
	}

	public void esborrarNumeros(float n1, float n2) {
		// Scanner lector = new Scanner(System.in);
		Esborrar sup = new Esborrar(n1, n2);
		System.out.println("Indica quin número vols esborrar");
		sup.mostrarNumeros();
		float num = lector.nextFloat();
		sup.esborrarNumero(num);
	}
}
