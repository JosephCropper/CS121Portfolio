import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Random rand = new Random();
        final int LEN = rand.nextInt(3, 11);
        int scores[][] = new int[2][LEN];
        int indexh = LEN-1;
        int indexl = indexh;
        System.out.println("Enter your " + LEN + " scores.");

        for (int i = LEN-1; i >= 0; i--){
            System.out.print("Enter test score: ");
            scores[0][i] = scan.nextInt();
            if (scores[0][i] > scores[0][indexh]){
                indexh = i;
            }
            if (scores[0][i] < scores[0][indexl]){
                indexl = i;
            }
            scores[1][i] = setLetter(scores[0][i]);
        }
        System.out.println("Grades: ");
        grading(scores, LEN, indexh, indexl);
    }

    public static char setLetter(int a){
        return (a >= 90 ? 'a' : a >= 80 ? 'b' : a >= 70? 'c' : a >= 60 ? 'd' : 'f');
    }

    public static void grading(int[][] a, final int length, int indexh, int indexl){
        int average = 0;
        for (int i = 0; i < length; i++){
            average += a[0][i];
            System.out.println(a[0][i] + "\t" + ((char)a[1][i]));
        }
        System.out.println("Highest: " + a[0][indexh]);
        System.out.println("Highest: " + a[0][indexl]);
        System.out.println("Average: " + (double)average/length);
    }
}