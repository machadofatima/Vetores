package vetores;

import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {

		/*
		 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
		 * construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
		 * irá digitar um número e o programa deve exibir na tela a posição deste número
		 * no vetor. Caso o número não seja encontrado, a mensagem: “Não foi
		 * encontrado!” deve ser exibida na tela.
		 * 
		 * Vetor: 2 5 1 3 4 9 7 8 10 6
		 * 
		 */

		Scanner ler = new Scanner(System.in);
		boolean encontrado = false;

		// Declara os elementos do vetor
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		// Solicita que o usuário insira um número e lê o número inserido
		System.out.println("Digite o número que deseja encontrar: ");
		int numero = ler.nextInt();
		
		

		for (int i = 0; i < vetorInteiros.length; i++) {

			if (vetorInteiros[i] == numero) {

				System.out.println("Numero encontrado na posição: " + i);
				encontrado = true;
				break;
			}

		}

		if (!encontrado) {
			System.out.println("Não encontrado");
		}

	}

}
