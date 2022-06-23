package Program;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		JogoDaVelha jogo = new JogoDaVelha();

		System.out.println("---BEM VINDO AO JOGO DA VELHA---");
		System.out.println("Player1 = X");
		System.out.println("Player2 = O");

		boolean sair = false;

		int linha = 0;
		int coluna = 0;
		int c = 0;

		while (!sair) {
			if (c % 2 == 0) {
				System.out.println("Player 1:");
				jogo.setPlayer1(true);
			} else {
				jogo.setPlayer1(false);
			}
			if (c % 2 != 0) {
				System.out.println("Player 2:");
				jogo.setPlayer2(true);
			} else {
				jogo.setPlayer2(false);
			}
			System.out.println("Entre com a linha: ");
			linha = sc.nextInt();

			while (jogo.linhaInvalida(linha)) {
				System.out.println("Insira um valor válido, digite novamente.");
				System.out.println("Entre com a linha: ");
				linha = sc.nextInt();
			}
			System.out.println("Entre com a coluna: ");
			coluna = sc.nextInt();

			while (jogo.colunaInvalida(coluna)) {
				System.out.println("Insira um valor válido, digite novamente.");
				System.out.println("Entre com a coluna: ");
				coluna = sc.nextInt();
			}

			while (jogo.verificarEspaco(linha, coluna)) {
				System.out.println("Espaço já preenchido, tente uma jogada válida!");
				System.out.println("Entre com a linha: ");
				linha = sc.nextInt();
				System.out.println("Entre com a coluna: ");
				coluna = sc.nextInt();
			}
			jogo.exibirTabuleiro(linha, coluna);

			if ((jogo.getTabuleiro()[0][0] == 'X' && jogo.getTabuleiro()[0][1] == 'X'
					&& jogo.getTabuleiro()[0][2] == 'X')
					|| (jogo.getTabuleiro()[1][0] == 'X' && jogo.getTabuleiro()[1][1] == 'X'
							&& jogo.getTabuleiro()[1][2] == 'X')
					|| (jogo.getTabuleiro()[2][0] == 'X' && jogo.getTabuleiro()[2][1] == 'X'
							&& jogo.getTabuleiro()[2][2] == 'X')
					|| (jogo.getTabuleiro()[0][0] == 'X' && jogo.getTabuleiro()[1][0] == 'X'
							&& jogo.getTabuleiro()[2][0] == 'X')
					|| (jogo.getTabuleiro()[0][1] == 'X' && jogo.getTabuleiro()[1][1] == 'X'
							&& jogo.getTabuleiro()[2][1] == 'X')
					|| (jogo.getTabuleiro()[0][2] == 'X' && jogo.getTabuleiro()[1][2] == 'X'
							&& jogo.getTabuleiro()[2][2] == 'X')
					|| (jogo.getTabuleiro()[0][0] == 'X' && jogo.getTabuleiro()[1][1] == 'X'
							&& jogo.getTabuleiro()[2][2] == 'X')
					|| (jogo.getTabuleiro()[0][2] == 'X' && jogo.getTabuleiro()[1][1] == 'X'
							&& jogo.getTabuleiro()[2][0] == 'X')) {
				System.out.println("PARABÉNS! Jogador 1 venceu");
				sair = true;

			} else if ((jogo.getTabuleiro()[0][0] == 'O' && jogo.getTabuleiro()[0][1] == 'O'
					&& jogo.getTabuleiro()[0][2] == 'O')
					|| (jogo.getTabuleiro()[1][0] == 'O' && jogo.getTabuleiro()[1][1] == 'O'
							&& jogo.getTabuleiro()[1][2] == 'O')
					|| (jogo.getTabuleiro()[2][0] == 'O' && jogo.getTabuleiro()[2][1] == 'O'
							&& jogo.getTabuleiro()[2][2] == 'O')
					|| (jogo.getTabuleiro()[0][0] == 'O' && jogo.getTabuleiro()[1][0] == 'O'
							&& jogo.getTabuleiro()[2][0] == 'O')
					|| (jogo.getTabuleiro()[0][1] == 'O' && jogo.getTabuleiro()[1][1] == 'O'
							&& jogo.getTabuleiro()[2][1] == 'O')
					|| (jogo.getTabuleiro()[0][2] == 'O' && jogo.getTabuleiro()[1][2] == 'O'
							&& jogo.getTabuleiro()[2][2] == 'O')
					|| (jogo.getTabuleiro()[0][0] == 'O' && jogo.getTabuleiro()[1][1] == 'O'
							&& jogo.getTabuleiro()[2][2] == 'O')
					|| (jogo.getTabuleiro()[0][2] == 'O' && jogo.getTabuleiro()[1][1] == 'O'
							&& jogo.getTabuleiro()[2][0] == 'O')) {
				System.out.println("PARABÉNS! Jogador 2 venceu!");
				sair = true;
			} else if (c > 7) {
				System.out.println("DEU VELHA! Ninguém ganhou essa partida. :((");
				sair = true;
			}
			c++;

		}
		sc.close();

	}

}
