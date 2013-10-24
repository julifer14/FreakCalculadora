package net.JuliClaude.FreakCalculadora;

import java.util.Scanner;

public class Operacions {
	
	float resultat; 
	public float suma(float num1, float num2){
		resultat = num1 + num2;
		return resultat;
	}
	public float resta(float num1, float num2){
		resultat = num1 - num2;
		return resultat;
	}
	public float multiplicacio(float num1, float num2){
		resultat=num1*num2;
		return resultat;
	}
	public float divisio(float num1, float num2){
		resultat=num1/num2;
		return resultat;
	}
	
	public String retornaBinari(float num){
		String resultatBinari;
		int num2 = (int) num;
		resultatBinari=Integer.toBinaryString(num2);		
		return resultatBinari;
	}
	
	public void esborrarNumeros(float n1, float n2) {
		Scanner lector = new Scanner(System.in);
		Esborrar sup = new Esborrar(n1, n2);
		System.out.println("Indica quin número vols esborrar");
		sup.mostrarNumeros();
		float num = lector.nextFloat();
		sup.esborrarNumero(num);
	}
	public float demanarNumero() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriu un número");
		float numero = lector.nextFloat();
		return numero;
	}
}