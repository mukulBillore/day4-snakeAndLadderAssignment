package snakeAndLadderGame;

import java.util.Random;

public class App {
	public static void ForPlayerOne() {
		System.out.println("Welocme to snake and ladder game for single player!!!");
		// @use case2
		Random rand = new Random();
		int dice = rand.nextInt(7) + 1;
		System.out.println("the number on dice is :-" + dice);
		// @use case3
		int p1Position = 0;
		int moveTodo = rand.nextInt(3);
		if (moveTodo == 0) {
			p1Position = p1Position + dice; // ladder
			System.out.println("hurry!! its the ladder!! so the position of the player is :" + p1Position);
		} else if (moveTodo == 1) {
			// @use case 4 if position is below zero then restarts from zero

			p1Position = p1Position - dice; // snake
			if (p1Position <= 0) {
				p1Position = 0;
			}
			System.out.println("sorry !! its a snake!! so the position of the player is :" + p1Position);
		} else
			System.out.println("it is the waiting move !! so the position of the player is :" + p1Position);
	}

	public static void main(String[] args) {
		App.ForPlayerOne();
	}

}
