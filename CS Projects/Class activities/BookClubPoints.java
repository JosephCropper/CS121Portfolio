package WeekTwo;
import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int books = 0;

        System.out.print("Number of books purchased: ");
        books = scan.nextInt();

        switch(books){
            case (0):
                System.out.print("0 points.");
                break;
            case (1):
                System.out.print("5 points.");
                break;
            case (2):
                System.out.print("15 points.");
                break;
            case (3):
                System.out.print("30 points.");
                break;
            default:
                if (books >= 4){
                    System.out.print("60 points.");
                }
                else{
                    System.out.print("Incorrect Entry.");
                }
                break;
        }


        TestScores.testScores();
    }
}

class TestScores{
    public static void testScores(){
        Scanner scan = new Scanner(System.in);
        int x, y, z;
        System.out.print("\nInsert 3 individual test scores on individual lines: \n");
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        int average = ((x + y + z) / 3);
        System.out.print("Average: " + average);
        if (average < 60){
            System.out.print("\tF");
        }
        else if (average < 70){
            System.out.print("\tD");
        }
        else if (average < 80){
            System.out.print("\tC");
        }
        else if (average < 90){
            System.out.print("\tB");
        }
        else if (average < 100){
            System.out.print("\tA");
        }

    }
}
