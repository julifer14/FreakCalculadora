package net.JuliClaude.FreakCalculadora;


public class Esborrar {
	float num1;
	float num2;
	
	public Esborrar(float n1, float n2){
		num1 = n1;
		num2 = n2;
	}
	
	public void mostrarNumeros(){
		System.out.println("Els n�meros s�n: ");
		System.out.println("N�mero 1: " + num1);
		System.out.println("N�mero 2: " + num2);
	}
	
	public void esborrarNumero(float num){
		Operacions operar = new Operacions();
		if(num1 == num){
			num1 = 0;
			System.out.println("N�mero esborrat correctament");
			System.out.println("Introdueix el numero correcte");
			num1 = operar.demanarNumero();
		}else if(num2 == num){
			num2 = 0;
			System.out.println("N�mero esborrat correctament");
			System.out.println("Introdueix el numero correcte");
			num2 = operar.demanarNumero();
		}else{
			System.out.println("El n�mero entrat no �s correcte");
		}
	}
	
}