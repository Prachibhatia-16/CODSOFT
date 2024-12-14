package Codsoft;
import java.util.*;
public class Number_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int rangeStart=1;
		int rangeEnd=100;
		int maxAttempts=5;
		int round=0;
		int score=0;
		String playAgain;
		Random random=new Random();
		do {
			int number=random.nextInt(rangeEnd-rangeStart+1)+rangeStart;
			int attempt=0;
			boolean guess=false;
			round++;
		while(attempt<maxAttempts) {
			System.out.println("Guess the number (Attempt "+(attempt+1)+"):");
			int n=s.nextInt();
			attempt++;
			if(n==number) {
				System.out.println("Congratulations! Your guess is correct");
				guess=true;
				score++;
				break;
			}else if(n<number){
				System.out.println("Too low!");
			}else {
				System.out.println("Too high!");
			}
		}
		
		if(!guess) {
			System.out.println("You are out of attempts");
		}
		System.out.println("Do you want to try for another round? (yes/no)");
		playAgain=s.next();
		}
		while(playAgain.equalsIgnoreCase("yes"));
		System.out.println("The number of rounds played are: "+round);
		System.out.println("Your score is: "+score);
		
	}

}
