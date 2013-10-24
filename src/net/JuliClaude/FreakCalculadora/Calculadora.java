package net.JuliClaude.FreakCalculadora;

import java.util.Scanner;

public class Calculadora {
	/*
	 * Calculadora xaxi guai que no serveix per a res. Plena de bugs!
	 */

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		int numero1 = c.demanarNumero();
		int numero2 = c.demanarNumero();
		System.out.println(numero1 + "" + numero2);
	}

	public int demanarNumero() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriu un número");
		int numero = lector.nextInt();
		return numero;
	}
}
