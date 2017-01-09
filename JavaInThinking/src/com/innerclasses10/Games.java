//: innerclasses/Games.java
// Using the anonymous inner classes with the Game Framework

package com.innerclasses10;

interface Game { boolean move(); }
interface GameFactory { Game getGame(); }

class Checker implements Game {
	private Checker() {}
	private int moves = 0;
	private static final int MOVE = 3;
	public boolean move() {
		System.out.println("Checker move: " + moves);
		return ++moves != MOVE;
	}
	public static GameFactory gamefactory = 
		new GameFactory() {
			public Game getGame() {
				return new Checker();
		}
	};
}

class Chess implements Game {
	private Chess() {}
	private int moves = 0;
	private static final int MOVE = 4;
	public boolean move() {
		System.out.println("Chess move: " + moves);
		return ++moves != MOVE;
	}
	public static GameFactory gamefactory =
		new GameFactory() {
			public Game getGame() {
				return new Chess();
		}
	};
}

public class Games {
	public static void playGame(GameFactory fact) {
		Game game = fact.getGame();
		while(game.move()) {
			
		}
	}
	
	public static void main(String[] args) {
		playGame(Checker.gamefactory);
		playGame(Chess.gamefactory);
	}

}
