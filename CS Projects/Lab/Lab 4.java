import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        String userinput;
        int randomColor;
        int correctguess = 0;
        for (int i = 0; i < 10; i++){
            randomColor = rand.nextInt(0, 5);
            System.out.println("Guess");
            userinput = scan.next();
            switch (randomColor){
                case 0:
                    System.out.println("The computer choose red.");
                    correctguess = userinput.compareTo("red") == 0 ? correctguess + 1 : correctguess;
                    break;
                case 1:
                    System.out.println("The computer choose green.");
                    correctguess = userinput.compareTo("green") == 0 ? correctguess + 1 : correctguess;
                    break;
                case 2:
                    System.out.println("The computer choose blue.");
                    correctguess = userinput.compareTo("blue") == 0 ? correctguess + 1 : correctguess;
                    break;
                case 3:
                    System.out.println("The computer choose orange.");
                    correctguess = userinput.compareTo("orange") == 0 ? correctguess + 1 : correctguess;
                    break;
                case 4:
                    System.out.println("The computer choose yellow.");
                    correctguess = userinput.compareTo("yellow") == 0 ? correctguess + 1 : correctguess;
                    break;
                default:
                    System.out.println("Error in entry. skipping...");
                    break;
            }
        }
        System.out.println(correctguess + " correct guesses");
    }
}