package net.JuliClaude.FreakCalculadora;

public class Operacions {
	
	int resultat; 
	public float suma(int num1, int num2){
		resultat = num1 + num2;
		return resultat;
	}
	public float resta(int num1, int num2){
		resultat = num1 - num2;
		return resultat;
	}
	public float multiplicacio(int num1, int num2){
		resultat=num1*num2;
		return resultat;
	}
	public float divisio(int num1, int num2){
		resultat=num1/num2;
		return resultat;
	}
	
	public String retornaBinari(int num){
		String resultatBinari;
		num = (int) num;
		resultatBinari=Integer.toBinaryString(num);		
		return resultatBinari;
	}
}