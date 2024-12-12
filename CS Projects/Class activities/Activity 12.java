import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of movies: ");
        final int NUMMOVIES = scan.nextInt();

        String movienames[] = new String[NUMMOVIES];
        boolean twothreeD[] = new boolean[NUMMOVIES];
        int availPricing[][] = new int [NUMMOVIES][2];

        for (int i = 0; i < NUMMOVIES; i++){
            System.out.printf("Movie name #%d: ", (i+1));
            movienames[i] = scan.next();
            System.out.println("Is the movie 3D? ");
            twothreeD[i] = scan.nextBoolean();
            System.out.println("Availability? ");
            availPricing[i][0] = scan.nextInt();
            System.out.println("Price? ");
            availPricing[i][1] = (int)(scan.nextDouble() * 100);
        }
        System.out.println("||\\\\---------------- MOVIE SHOWINGS ----------------//||\nMovie Name\tMovie Type\tSeats Available\tTicket Price");
        for (int i = 0; i < NUMMOVIES; i++){
            System.out.println(movienames[i] +"\t"+ (twothreeD[i]? "3D": "2D") + "\t" + availPricing[i][0] + "\t" + (availPricing[i][1]/100.0));
        }
    }
}

