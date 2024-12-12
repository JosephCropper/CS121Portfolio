import java.util.Scanner;

public class switches {
    public static void main(String[] args){
        int x;
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number 1 - 4: ");
            x = scan.nextInt();
            switch (x) {
                case (1):
                    System.out.println("1, one, 001");
                    break;
                case (2):
                    System.out.println("2, two, 010");
                    break;
                case (3):
                    System.out.println("3, three, 011");
                    break;
                case (4):
                    System.out.println("4, four, 100");
                    break;
                default:
                    System.out.println(" * LOUD INCORRECT BUZZER *");
                    break;
            }
        }
    }
}
