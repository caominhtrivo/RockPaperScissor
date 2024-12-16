import java.util.Scanner;

public class Game {
    String userPick;
    String computerPick;

    String getComputerPick() {
        int randomNumber = (int)(Math.random()*3 + 1);
        if (randomNumber == 1) {
            computerPick = "rock";
        }
        else if (randomNumber == 2) {
            computerPick = "paper";
        }
        else {
            computerPick = "scissors";
        }
        return computerPick;
    }

    String getUserPick() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter rock, paper, or scissors: ");
            userPick = sc.nextLine();
            if(userPick.equals("rock") || userPick.equals("paper") || userPick.equals("scissors")) {
                break;
            }
            System.out.println("Invalid input");
        }
        return userPick;
    }
    String getResult(String userPick, String computerPick) {
        if (userPick.equals(computerPick)) {
            return "draw";
        }

        else if (userPick.equals("rock") && computerPick.equals("scissors")) {
            return "win";
        }
        else if (userPick.equals("paper") && computerPick.equals("rock")) {
            return "win";
        }
        else if (userPick.equals("scissors") && computerPick.equals("paper")) {
            return "win";
        }
        else return "lose";
    }


}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            Game game = new Game();
            String userPick = game.getUserPick();
            String computerPick = game.getComputerPick();
            String result = game.getResult(userPick, computerPick);

            System.out.println("You pick: " + userPick);
            System.out.println("Computer: " + computerPick);
            System.out.println("Result: " + result);

            System.out.println("Do you want to play again? (y/n)");
            String answer = sc.nextLine();
            if (answer.equals("n")) {
                break;
            }
        }
    }
}
