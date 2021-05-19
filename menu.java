import java.util.*;
public class menu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int choice = -1;
		int option = 0;
		int win = 0;
		int loss = 0;
		int total = 0;
		String name = "";
		
		System.out.println("What is your name?"); //gets the name of the player
		name = scan.nextLine();
		System.out.println("Hello " + name);
		System.out.println("Your current record is 0-0");
		
		System.out.println("Would you like to play a game of Rock, Paper, Scissors, Lizard, Spock?");
		System.out.println("No(0)-Yes(1)");
		option = scan.nextInt();
		
		while(option == 1) {
			System.out.println("What would you like to throw?");
			System.out.println("Rock(1)-Paper(2)-Scissors(3)-Lizard(4)-Spock(5)"); //asks the user for what they want to play
			choice = scan.nextInt();
			int random_int = (int)Math.floor(Math.random() * (5) + 1);
			total = win + loss;
			int hold = win;
			
			if(choice == 1) { //prints out the user's choice
				System.out.println("Rock");
			}else if(choice == 2) {
				System.out.println("Paper");
			}else if(choice == 3) {
				System.out.println("Scissors");
			}else if(choice == 4) {
				System.out.println("Lizard");
			}else {
				System.out.println("Spock");
			}
			
			if(random_int == 1) { //prints out the computer's choice
				System.out.println("Rock");
			}else if(random_int == 2) {
				System.out.println("Paper");
			}else if(random_int == 3) {
				System.out.println("Scissors");
			}else if(random_int == 4) {
				System.out.println("Lizard");
			}else {
				System.out.println("Spock");
			}
			
			if(choice == 1 && random_int == 2) { //all winning outcomes for user
				System.out.println("Rock crushes Scissors");
				System.out.println("You win");
				win++;
			}
			if(choice == 1 && random_int == 4) {
				System.out.println("Rock crushes Lizard");
				System.out.println("You win");
				win++;
			}
			if(choice == 2 && random_int == 1) {
				System.out.println("Paper covers Rock");
				System.out.println("You win");
				win++;
			}
			if(choice == 2 && random_int == 5) {
				System.out.println("Paper disproves Spock");
				System.out.println("You win");
				win++;
			}
			if(choice == 3 && random_int == 2) {
				System.out.println("Scissors cuts Paper");
				System.out.println("You win");
				win++;
			}
			if(choice == 3 && random_int == 4) {
				System.out.println("Scissors decapitates Lizard");
				System.out.println("You win");
				win++;
			}
			if(choice == 4 && random_int == 2) {
				System.out.println("Lizard eats Paper");
				System.out.println("You win");
				win++;
			}
			if(choice == 4 && random_int == 5) {
				System.out.println("Lizard poisons Spock");
				System.out.println("You win");
				win++;
			}
			if(choice == 5 && random_int == 1) {
				System.out.println("Spock vaporizes Rock");
				System.out.println("You win");
				win++;
			}
			if(choice == 5 && random_int == 3) {
				System.out.println("Spock smashes Scissors");
				System.out.println("You win");
				win++;
			}
			
			if(hold == win) {
				if(choice == 3 && random_int == 1) { //all losing outcomes for user
					System.out.println("Rock crushes Scissors");
					System.out.println("You lose");
					loss++;
				}
				if(choice == 4 && random_int == 1) {
					System.out.println("Rock crushes Lizard");
					System.out.println("You lose");
					loss++;
				}
				if(choice == 1 && random_int == 2) {
					System.out.println("Paper covers Rock");
					System.out.println("You lose");
					loss++;
				}
				if(choice == 5 && random_int == 2) {
					System.out.println("Paper disproves Spock");
					System.out.println("You lose");
					loss++;
				}
				if(choice == 2 && random_int == 3) {
					System.out.println("Scissors cuts Paper");
					System.out.println("You lose");
					loss++;
				}
				if(choice == 4 && random_int == 3) {
					System.out.println("Scissors decapitates Lizard");
					System.out.println("You lose");
					loss++;
				}
				if(choice == 2 && random_int == 4) {
					System.out.println("Lizard eats Paper");
					System.out.println("You lose");
					loss++;
				}
				if(choice == 5 && random_int == 4) {
					System.out.println("Lizard poisons Spock");
					System.out.println("You lose");
					loss++;
				}
				if(choice == 1 && random_int == 5) {
					System.out.println("Spock vaporizes Rock");
					System.out.println("You lose");
					win++;
				}
				if(choice == 3 && random_int == 5) {
					System.out.println("Spock smashes Scissors");
					System.out.println("You lose");
					win++;
				}
			}
			
			if((win + loss) == total) {
				System.out.println("You guys tie");
				System.out.println("Nothing happens");
			}
			
			System.out.println("Score:" + win + "-" + loss);
			
			System.out.println("Do you want to keep playing?");
			System.out.println("No(0)-Yes(1)");
			option = scan.nextInt();
		}
		
	}
}
