import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many students? How many scores per student?");
        boolean check = true;
        int studentss = scan.nextInt();
        int scoresPer = 0;
        double average;
        for (int students = 1; students <= studentss ; students++){
            average = 0;
            if(check){
                scoresPer = scan.nextInt();
                check = false;
            }
            System.out.println("Enter " + scoresPer + " scores for student " + students);
            for (int i = 0; i < scoresPer; i ++){
                average += scan.nextDouble();
            }
            System.out.println("Student " + students + " average is " + (average / scoresPer));
        }


        
    }
}