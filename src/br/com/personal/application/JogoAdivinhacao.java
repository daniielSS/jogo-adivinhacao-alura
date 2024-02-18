package br.com.personal.application;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
	public static void main(String[] args) {
		
		int numeroGerado = new Random().nextInt(100);
		int valorUsuario;
		int tentativas;
		
		System.out.println("#---Jogo Adivinhação---#");
		System.out.println(" ");
		System.out.println("PC: Vamos brincar de adivinha? Eu pensei em um número, você tem 5 tentativas para tentar acertar o número que"
				+ " estou pensando.");
		
		System.out.print("Digite um número entre (0 á 100): ");
		Scanner valorDigitado = new Scanner(System.in);
		valorUsuario = valorDigitado.nextInt();
		
		for(tentativas = 2; tentativas <= 5; tentativas++) {
			if(valorUsuario != numeroGerado) {
				if(valorUsuario < numeroGerado) {
					System.out.println("PC: Número incorreto! O valor que estou pensando é maior.");
				} else if(valorUsuario > numeroGerado) {
					System.out.println("PC: Número incorreto! O valor que estou pensando é menor.");
				}
				System.out.println(" ");
				System.out.print("Digite outro número " + "(" + tentativas + "/5" + "): ");
				Scanner valorDigitado2 = new Scanner(System.in);
				valorUsuario = valorDigitado2.nextInt();
				
				if(tentativas == 5 && valorUsuario != numeroGerado) {
					System.out.println("PC: Não foi dessa vez :( O número era: " + numeroGerado);
					break;
				}
				
			}
			if(valorUsuario == numeroGerado) {
				System.out.println("PC: Parabéns!! Você acertou :) O número era: " + numeroGerado);
				break;
			}
			
		}
		
		System.out.println(" ");
		System.out.println("#----------------------#");
		
	}
}
