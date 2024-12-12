package Week4;
import java.util.Scanner;

public class FtoC {
    public static void main(String[] args){
        double x = 0;
        for (double i = 0; i <= 20; i++){
            x = ((i * (9.0/5)) + 32);
            System.out.printf(i + " C || %.1f F %n", x);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter speed and time (hours)");
        int speed = scan.nextInt();
        int hours = scan.nextInt();
        DistanceTravelled.distance(speed, hours);

    }
}

class DistanceTravelled{
    public static void distance(int x, int y){
        System.out.println("distance = " + x * y + " miles");
    }
}
