
import java.util.Scanner;

public class RPSGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int playerOnePick = 0;
		int playerTwoPick = 0;
		
		while (playerOnePick != 1 && playerOnePick != 2 && playerOnePick != 3)
		{
			System.out.print("PLAYER 1: Enter '1' for Rock, '2' for Paper, or '3' for Scissors: ");
			playerOnePick = input.nextInt();
			
			System.out.print("PLAYER 2: Enter '1' for Rock, '2' for Paper, or '3' for Scissors: ");
			playerTwoPick = input.nextInt();
			
			if (playerOnePick == 1 && playerTwoPick == 1)
			{System.out.print("It's a Draw!");}
			else if (playerOnePick == 2 && playerTwoPick == 2)
			{System.out.print("It's a Draw!");}
			else if (playerOnePick == 3 && playerTwoPick == 3)
			{System.out.print("It's a Draw!");}
			
			else if (playerOnePick == 1 && playerTwoPick == 2)
			{System.out.print("Paper beats Rock! PLAYER 2 wins!");}
			else if (playerOnePick == 1 && playerTwoPick == 3)
			{System.out.print("Rock beats Scissors! PLAYER 1 wins!");}
			
			else if (playerOnePick == 2 && playerTwoPick == 1)
			{System.out.print("Paper beats Rock! PLAYER 1 wins!");}
			else if (playerOnePick == 2 && playerTwoPick == 3)
			{System.out.print("Scissors beats Paper! PLAYER 2 wins!");}
			
			else if (playerOnePick == 3 && playerTwoPick == 1)
			{System.out.print("Rock beats Scissors! PLAYER 2 wins!");}
			else if (playerOnePick == 3 && playerTwoPick == 2)
			{System.out.print("Scissors beats Paper! PLAYER 1 wins!");}
		}
	}

}
