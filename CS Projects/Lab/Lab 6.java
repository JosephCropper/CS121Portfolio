import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static double lengthx = 0;
    private static double widthy = 0;
    public static void main(String[] args) {
        displayData();


        scan.close();
    }

    private static double getLength(double x){
        lengthx = x;
        return x;
    }

    private static double getWidth(double x){
        widthy = x;
        return x;
    }

    private static double getArea(){
        return (widthy * lengthx);
    }

    private static void displayData(){
        System.out.println("Length: ");
        getLength(scan.nextDouble());
        System.out.println("Width: ");
        getWidth(scan.nextDouble());
        System.out.println("L: " + lengthx + " | W: " + widthy + " | A: " + lengthx * widthy);
    }
}