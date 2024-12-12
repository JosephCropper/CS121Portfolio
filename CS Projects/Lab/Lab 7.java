import java.util.Scanner;
import java.util.Random;

//Copying the code from the document broke almost every line, so I'm just writing original and optimizing it to requirements

class Main{

    public static void main(String args[]){
        MovieTest.begin();
        MovieTest.begin();
    }
}

class MovieTest{
    private static Scanner scan = new Scanner(System.in);

    public static void begin(){
        boolean selectloop;
        int selectedMovie = -1;
        MovieSimul movies[] = new MovieSimul[4];
        System.out.println("-----------Movies-----------");
        for (int i = 0; i < 4; i++){
            movies[i] = new MovieSimul((i+1), (i%2 == 0? true : false), ((int)((i+1.3)*524)));
            System.out.println(movies[i].toString());
        }
        System.out.println("-----------Select-----------");
        selectloop = true;
        while(selectloop){
            System.out.println("EnterMovieName: ");
            selectedMovie = MovieSimul.movieSelect(scan.next());
            selectloop = (selectedMovie != -1? false:true);
        }
        System.out.println("\n" + movies[selectedMovie].toString() +"\n-----------Seating-----------");
        movies[selectedMovie].randomizeSeats();
        movies[selectedMovie].displaySeats();
        System.out.println("-----------Select-----------\n\t 0 = taken");
        System.out.println("Number of tickets? ");
        selectloop = true;
        for (int i = scan.nextInt(); i > 0; i--){
            while(selectloop){
                System.out.println("Select seat: ");
                selectloop = movies[selectedMovie].selectSeat(scan.next());
                System.out.println(selectloop? "Invalid option." : "Booked");
            }
            selectloop = true;
        }
        movies[selectedMovie].displaySeats();


    }
}
class MovieSimul{
    private Random rand = new Random();
    private int id;
    private boolean type;
    private int price;
    private boolean seating[][] = new boolean[5][10];
    //false = open

    public MovieSimul(int movieId, boolean tdtd, int p){
        id = movieId;
        type = tdtd;
        price = p;
        for(int x = 0; x<5; x++){
            for (int y = 0; y<10; y++){
                seating[x][y] = false;
            }
        }
    }

    public boolean selectSeat(String input) {
        int yval = -3;
        switch (input.charAt(0)){
            case 'A':
                yval = 0;
                break;
            case 'B':
                yval = 1;
                break;
            case 'C':
                yval = 2;
                break;
            case 'D':
                yval = 3;
                break;
            case 'E':
                yval = 4;
                break;
            case 'F':
                yval = 5;
                break;
            case 'G':
                yval = 6;
                break;
            case 'H':
                yval = 7;
                break;
            case 'I':
                yval = 8;
                break;
            case 'J':
                yval = 9;
                break;
            default:
                return true;
        }
       if (seating[Integer.valueOf(input.charAt(1)+"") - 1][yval] == false){
           seating[Integer.valueOf(input.charAt(1)+"") - 1][yval] = true;
           return false;

       }
       return true;
    }

    public void displaySeats(){
        System.out.println("  A B C D E F G H I J");
        for(int x = 0; x<5; x++){
            System.out.print(x+1 + " ");
            for (int y = 0; y<10; y++){
                System.out.print((seating[x][y]? "0 ":"1 "));
            }
            System.out.println();
        }

    }

    public void randomizeSeats(){
        for(int x = 0; x<5; x++){
            for (int y = 0; y<10; y++){
                seating[x][y] = rand.nextBoolean();
            }
        }
    }

    public static int movieSelect(String movie){

        switch (movie){
            case "MovieOne":
                return 0;
            case "MovieTwo":
                return 1;
            case "MovieThree":
                return 2;
            case "MovieFour":
                return 3;
            default:
                return -1;
        }
    }

    public String toString(){
        //movieRosterNameEdit
        return ((id == 1? "MovieOne" : id == 2? "MovieTwo" : id == 3? "MovieThree" : id == 4? "MovieFour" : "MovieIdNotFound") + "   " +
                (type == true? "3D" : "2D") + "   " +
                (price/100.0));
        //Name   type   price
    }

}