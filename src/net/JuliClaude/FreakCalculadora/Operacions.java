package net.JuliClaude.FreakCalculadora;

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
}