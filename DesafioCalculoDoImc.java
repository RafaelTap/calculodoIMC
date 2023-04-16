package Desafios;

import java.util.Scanner;

public class DesafioCalculoDoImc {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// fórmula do IMC: IMC = peso/altura²
		
		System.out.println("Digite seu peso.");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite sua altura.");
		double altura = entrada.nextDouble();
		
		var altura2 = Math.pow(altura, 2);
		double imc = peso/altura2;
		
		System.out.printf("%s %.1f", "IMC =", imc);
		
		entrada.close();
		
		
	
	
	}

}
