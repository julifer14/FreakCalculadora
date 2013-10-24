package net.JuliClaude.FreakCalculadora;

public class Esborrar {
	float num1;
	float num2;
	
	public Esborrar(float n1, float n2){
		num1 = n1;
		num2 = n2;
	}
	
	public void mostrarNumeros(){
		System.out.println("Els números són: ");
		System.out.println("Número 1: " + num1);
		System.out.println("Número 2: " + num2);
	}
	
	public void esborrarNumero(float num){
		if(num1 == num){
			num1 = 0;
			System.out.println("Número esborrat correctament");
		}else if(num2 == num){
			num2 = 0;
			System.out.println("Número esborrat correctament");
		}else{
			System.out.println("El número entrat no és correcte");
		}
	}
	
}
