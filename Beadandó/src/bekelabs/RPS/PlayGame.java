package bekelabs.RPS;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game game = new Game();
		char quit = 0;
		while (quit != 'I') {
			game.play();
			System.out.println("Ha szeretn�l kil�pni irj igent,tov�bbi j�t�khoz egy b�rmilyen karaktert!");
			quit = sc.nextLine().toUpperCase().charAt(0);
		}
		sc.close();
		game.displayStats();
	}
}
