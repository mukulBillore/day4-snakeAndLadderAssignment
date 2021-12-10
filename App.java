package snakeAndLadderGame;

import java.util.Random;
import java.util.Scanner;

public class App {
	public static void ForPlayerOne() {
		System.out.println("Welocme to snake and ladder game for single player!!!");

		final int winPos = 100;
		int p1Position = 0;
		Random rand = new Random();
		int countChance = 0;// @ use case 6 adding the count of moves
		while (p1Position != 100) {
			countChance++;

			int dice = rand.nextInt(7) + 1;
			System.out.println("the number on dice is : " + dice);

			int moveTodo = rand.nextInt(3);
			if (moveTodo == 0) {
				int temp = p1Position + dice;
				if (temp <= 100) {
					p1Position = temp; // ladder
					System.out.println("hurry!! its the ladder!! so the position of the player is :" + p1Position);
				} else
					System.out.println("sorry you have to wait its a" + dice
							+ "which takes you above 100 and you cant go there  ");
			} else if (moveTodo == 1) {

				p1Position = p1Position - dice; // snake
				if (p1Position <= 0) {
					p1Position = 0;
				}
				System.out.println("sorry !! its a snake!! so the position of the player is :" + p1Position);
			} else
				System.out.println("it is the waiting move !! so the position of the player is :" + p1Position);
		}
		System.out.println("Conratulations !! to you are at 100th position so you win and you are able to win in only "
				+ countChance + " moves");
	}

	public static void fortwoPlayers() {
		System.out.print("welcome to snake and ladders for two player for two players!!");
		int p1Position = 0;
		int p2Position = 0;
		Random rand = new Random();
		int chanceofPlayer = 1;
		while (chanceofPlayer != 9) {
			while (chanceofPlayer == 1 && p1Position != 100) {
				int dice = rand.nextInt(7) + 1;
				int moveTodo = rand.nextInt(3);
				// ladder
				if (moveTodo == 0) {
					chanceofPlayer = 1;
					p1Position = p1Position + dice;
				}
				// snake
				else if (moveTodo == 1) {
					chanceofPlayer = 2;
					p1Position = p1Position - dice;
				} else {
					chanceofPlayer = 2;
				}
			}
			while (chanceofPlayer == 2 && p2Position != 100) {
				int dice = rand.nextInt(7) + 1;
				int moveTodo = rand.nextInt(3);
				// ladder
				if (moveTodo == 0) {
					chanceofPlayer = 2;
					p2Position = p2Position + dice;
				}
				// snake
				else if (moveTodo == 1) {
					chanceofPlayer = 1;
					p1Position = p1Position - dice;
				} else {
					chanceofPlayer = 1;
				}
			}
			if(p1Position==100) {
				chanceofPlayer=9;
				System.out.print("player 1 wins");
			}
			if(p2Position==100) {
				chanceofPlayer=9;
				System.out.print("player 2 wins");
			}
		}

	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press '1' for single player game and '2' for two players game");
		int noOfPlayers = sc.nextInt();
		if (noOfPlayers == 1)
			App.ForPlayerOne();
		else
			App.fortwoPlayers();
	}

}
