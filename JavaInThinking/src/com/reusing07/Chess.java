//: reusing/Chess.java

package com.reusing07;

class Game {
	Game(int i) { System.out.println(" Game() Construct! "); }
}
	
class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println(" BoardGame() Construct!");
	}
}

public class Chess extends BoardGame {

	Chess(int i) {
		super(i);
		System.out.println(" Chess() Construct!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chess x = new Chess(2);
	}

}
