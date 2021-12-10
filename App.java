package snakeAndLadderGame;

import java.util.Random;

public class App {
	public static void ForPlayerOne() {
		System.out.println("Welocme to snake and ladder game for single player!!!");
		// @ use case 5 : competing the game and adding the win condition.
		final int winPos = 100;
		int p1Position = 0;
		Random rand = new Random();
		while (p1Position != 100) {

			
			int dice = rand.nextInt(7) + 1;
			System.out.println("the number on dice is : " + dice);

			int moveTodo = rand.nextInt(3);
			if (moveTodo == 0) {
				int temp=p1Position + dice;
				if(temp<=100) {
				p1Position = temp; // ladder
				System.out.println("hurry!! its the ladder!! so the position of the player is :" + p1Position);
				}
				else System.out.println("sorry you have to wait its a"+dice+"which takes you above 100 and you cant go there  ");
			} else if (moveTodo == 1) {

				p1Position = p1Position - dice; // snake
				if (p1Position <= 0) {
					p1Position = 0;
				}
				System.out.println("sorry !! its a snake!! so the position of the player is :" + p1Position);
			} else
				System.out.println("it is the waiting move !! so the position of the player is :" + p1Position);
		}System.out.println("Conratulations !! to you are at 100th position so you win ");
	}

	public static void main(String[] args) {
		App.ForPlayerOne();
	}

}
