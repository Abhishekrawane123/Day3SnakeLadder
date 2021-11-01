package com.bridgelabz.Snake_Ladder;

public class Snake_Ladders {

	public static void main(String[] args) {


		final int NO_PLAY = 0;
		final int snake = 1;
		final int ladder = 2;
		int player = 0;
		
		while(player<100) {
		
		int dice = (int) ((Math.random() * 10) % 6) + 1;

		int act = (int) ((Math.random() * 10) % 3);

		switch (act) {
		
		case NO_PLAY:
			break;
		case snake:
			int temp = player - dice;
			if(temp<0) {
				player=0;
			}
			else 
				player=temp;
			break;
		case ladder:
			player = player + dice;
			break;
		
		}
		}
		System.out.println("player position " + player);
	
	}
}


