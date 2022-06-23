package Program;

public class JogoDaVelha {

	private boolean player1;
	private boolean player2;
	private char[][] tabuleiro = new char[3][3];

	public boolean isPlayer1() {
		return player1;
	}

	public void setPlayer1(boolean player1) {
		this.player1 = player1;
	}

	public boolean isPlayer2() {
		return player2;
	}

	public void setPlayer2(boolean player2) {
		this.player2 = player2;
	}

	public char[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public void exibirTabuleiro(int linha, int coluna) {

		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (player1) {
					tabuleiro[linha][coluna] = 'X';
				} else if (player2) {
					tabuleiro[linha][coluna] = 'O';
				}
				System.out.print(tabuleiro[i][j] + "|");
			}
			System.out.println();
		}
	}

	public boolean linhaInvalida(int linha) {
		if (linha > 2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean colunaInvalida(int coluna) {
		if (coluna > 2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verificarEspaco(int linha, int coluna) {
		if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
			return true;

		} else {
			return false;
		}
	}

}
