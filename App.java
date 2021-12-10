package snakeAndLadderGame;

import java.util.Random;

public class App {
	public static void ForPlayerOne() {
		System.out.println("Welocme to snake and ladder game for single player!!!");

		final int winPos = 100;
		int p1Position = 0;
		Random rand = new Random();
		int countChance=0;//@ use case 6 adding the count of moves
		while (p1Position != 100) {
			countChance++;
			
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
		}System.out.println("Conratulations !! to you are at 100th position so you win and you are able to win in only "+countChance+" moves");
	}

	public static void main(String[] args) {
		App.ForPlayerOne();
	}

}
