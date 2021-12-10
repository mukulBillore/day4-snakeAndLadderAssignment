package snakeAndLadderGame;

import java.util.Random;

public class App {
	public static void ForPlayerOne() {
		System.out.println("Welocme to snake and ladder game for single player!!!");
	//@use case1 
		Random rand = new Random();
	    int dice = rand.nextInt(7);
	    System.out.println("the number on dice is :-"+dice);
	}
	public static void main(String[] args) {
		App.ForPlayerOne();
	}

}
