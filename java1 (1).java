package java1;

import java.util.Random;
import java.util.Scanner;

public class java1 {
	public static void main(String[] args) {
		int[] jogador1 = new int[500];
		int[] jogador2 = new int[500];
		int posicaoJogador1 =0;
		int posicaoJogador2 =0;
		boolean finalizar = false;
		
		Random random = new Random();
		do {
			System.out.println(">>> Vez do jogador 1 <<<");
			int dado = random.nextInt(6) +1;
			posicaoJogador1+=dado;
			System.out.println("Ande " + dado + " Voce esta na casa " + posicaoJogador2);
			
			System.out.println(">>> Vez do jogador 2 <<<");
			int dado2 = random.nextInt(6) +1;
			posicaoJogador2+=dado2;
			System.out.println("Ande " + dado2 + " Voce esta na casa " + posicaoJogador2);
			
			if (posicaoJogador1>=30) {
				System.out.println("Jogador 1 Vecedor");
				finalizar = true;
				break;
				
			}else if (posicaoJogador2>=30) {
					System.out.println("Jogador 2 Vecedor");
					finalizar = true;
					break;
			}
		}while(finalizar!=true);
					
		}
	}
