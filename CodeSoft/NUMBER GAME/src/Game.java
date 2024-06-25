import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random random =new Random();
        boolean playAgain = true;
        int totalRound = 0;
        int totalAttempt =0;


        System.out.println("Welcome to the Number Guessing Game!!! ");

        while(playAgain){
            int randomNumber =random. nextInt(100)+1;
            int attempt = 0;
            boolean guessedCorrect =false;

            while(attempt < 10 && !guessedCorrect){
                System.out.println("Enter your guessed Number: ");
                int userGuess =sc.nextInt();
                attempt++;

                if(userGuess == randomNumber){
                    guessedCorrect =true;
                    System.out.println("Congratulations! You've gussed the correct number. ");
                }else if(userGuess < randomNumber){
                    System.out.println("too low ,Try again");
                }else{
                    System.out.println("too high,Try again.");
                }

            }
            if(!guessedCorrect){
                System.out.println("Sorry, You lost with your all 10 attempts.\nThe Correct number was -> "+randomNumber+" <-.");
            }
            totalRound++;
            totalAttempt += attempt;
            System.out.println();
            System.out.println("Do you want to play again? (yes/no): ");
            String userResponse =sc.next();

            if(!userResponse.equalsIgnoreCase("yes")){
                playAgain =false;
            }


        }
        System.out.println("\n Thanksyou for playing!");
        System.out.println("Your Total Rounds "+totalRound);
        System.out.println("Your Total attempts "+totalAttempt);
        System.out.println("Your average attempts per round: "+((double)totalAttempt) /totalRound);
        System.out.println("----------------------------------------------------");


    }
}
