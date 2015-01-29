import java.util.Scanner;

public class PaperScissorsStoneGame extends RoundBasedGame 
{
	private String player1;
	private String player2;
	private int scorePlayer1 = 0;
	private int scorePlayer2 = 0;
	public Scanner scan = new Scanner(System.in);
	
	public PaperScissorsStoneGame(String p1, String p2)
	{
		player1 = p1;
		player2 = p2;
	}
	
	public void instructPlayer()
	{
		System.out.println("Sieger wird , wer dreimal gewinnt . \nDie Regeln :");
		System.out.println("1. Schere schneidet Papier");
		System.out.println("2. Stein schleift Schere");
		System.out.println("3. Papier umwickelt Stein\n");
	}
	
	public boolean isFinished()
	{
		if (scorePlayer1 == 3 || scorePlayer2 == 3)
		{
			return true;
		}else{
			return false;
		}
	}
	
	public void startNextRound()
	{
		System.out.printf("%s (Schere, Stein, Papier)? : ", player1);
		String eingabe1 = scan.next(); 
		System.out.printf("%s (Schere, Stein, Papier)? : ", player2);
		String eingabe2 = scan.next();
		
		if (eingabe1.equalsIgnoreCase("Schere") && eingabe2.equalsIgnoreCase("Stein"))
		{
			scorePlayer2 += 1;
			player2 += "*";
		}
		if (eingabe1.equalsIgnoreCase("Schere") && eingabe2.equalsIgnoreCase("Papier")) 
		{
			scorePlayer1 += 1;
			player1 += "*";
		}
		if (eingabe1.equalsIgnoreCase("Stein") && eingabe2.equalsIgnoreCase("Schere")) 
		{
			scorePlayer1 += 1;
			player1 += "*";
		}
		if (eingabe1.equalsIgnoreCase("Papier") && eingabe2.equalsIgnoreCase("Schere")) 
		{
			scorePlayer2 += 1;
			player2 += "*";
		}
		if (eingabe1.equalsIgnoreCase("Stein") && eingabe2.equalsIgnoreCase("Papier")) 
		{
			scorePlayer2 += 1;
			player2 += "*";
		}
		if (eingabe1.equalsIgnoreCase("Papier") && eingabe2.equalsIgnoreCase("Stein")) 
		{
			scorePlayer1 += 1;
			player1 += "*";
		}
	}
	
	public void showResults()
	{
		System.out.printf("\n%s hat %d mal gewonnen. \n", player1, scorePlayer1);
		System.out.printf("%s hat %d mal gewonnen. \n", player2, scorePlayer2);
		String winner;
		if (scorePlayer1 > scorePlayer2)
		{
			winner = player1;
		}else{
			winner = player2;
		}
		System.out.printf("=>%s hat gewonnen! ", winner);		
	}
}




























