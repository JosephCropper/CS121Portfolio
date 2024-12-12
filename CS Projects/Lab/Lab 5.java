import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalrooms = 0;
        int occupiedrooms = 0;
        int floors;
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of floors: ");
        floors = scan.nextInt();
        for (int i = 0; i < floors; i++){
            System.out.println("Number of total rooms?");
            totalrooms  += scan.nextInt();
            System.out.println("Number of occupied rooms?");
            occupiedrooms += scan.nextInt();
        }
        System.out.println(floors + " " + totalrooms + " " + occupiedrooms + " " + (totalrooms - occupiedrooms) + " " + ((double)occupiedrooms / totalrooms));
    }
}

