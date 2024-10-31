package vetores;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {

		/*
		 * Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor.
		 * 
		 * Em seguida, mostre na tela: - Todos os elementos das índices ímpares do vetor
		 * - Todos os elementos do vetor que são números pares - A Soma de todos os
		 * elementos do vetor - A Média de todos os elementos do vetor, armazenada em
		 * uma variável do tipo real
		 * 
		 */

		Scanner ler = new Scanner(System.in);
		int inicio;
		float media, soma = 0;
		int vetor[] = new int[10];
		String vetorPar = "";
		String vetorImpar = " ";

		// Solicita que o usuário insira 10 números e lê os números inseridos
		for (inicio = 0; inicio < 10; inicio++) {
			System.out.println("Digite os números do vetor");
			int valorRecebido = ler.nextInt(); // Lê o número inserido pelo usuário

			vetor[inicio] = valorRecebido; // Armazena o número no vetor na posição atual

			// Verifica se o número inserido é par
			if (valorRecebido % 2 == 0) {
				vetorPar += ", " + valorRecebido;
			} else { 
				vetorImpar += ", " + valorRecebido; // Adiciona o número dos índices ímpares a variável 'vetorImpar'
			}

			soma = soma + valorRecebido;

		}

		media = soma / 10;

		System.out.println("Elementos índices impares: " + vetorImpar);
		System.out.println("Elementos índices pares: " + vetorPar);
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);

	}
}
