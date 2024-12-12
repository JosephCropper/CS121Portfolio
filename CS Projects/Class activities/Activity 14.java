import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Movie moviestoday[] = new Movie[3];
        moviestoday[0] = new Movie("Transformers_One", true, 1576);
        moviestoday[1] = new Movie("Deadpool_III", false, 2169);
        moviestoday[2] = new Movie("The_Wandering_Robot", true, 1700);
        System.out.print("-----------------------------------------\n");
        System.out.printf("%s %10s %10s\n", moviestoday[0].returnStats()[0], moviestoday[0].returnStats()[1], moviestoday[0].returnStats()[2]);
        System.out.printf("%s %14s %10s\n", moviestoday[1].returnStats()[0], moviestoday[1].returnStats()[1], moviestoday[1].returnStats()[2]);
        System.out.printf("%s %7s %9s\n", moviestoday[2].returnStats()[0], moviestoday[2].returnStats()[1], moviestoday[2].returnStats()[2]);
        System.out.print("-----------------------------------------\n");

        int movieSelected = selectMovie(moviestoday[0], moviestoday[1], moviestoday[2]);
        moviestoday[movieSelected].returnStatsP();
        moviestoday[movieSelected].randomizer();
        moviestoday[movieSelected].displayAll();

    }

    public static int selectMovie(Movie a, Movie b, Movie c){
        Scanner scan = new Scanner(System.in);
        int returnval = -1;
        boolean loop = true;
        while (loop){
            System.out.println("Select movie name: ");
            String input = scan.next();
            returnval = input.toLowerCase().compareTo(a.name.toLowerCase()) == 0? 0 : input.toLowerCase().compareTo(b.name.toLowerCase()) == 0? 1 : input.toLowerCase().compareTo(c.name.toLowerCase()) == 0? 3 : -1;
            if (returnval != -1){
                loop = false;
            }
        }
        return returnval;
    }
}

class Movie{
    public String name;
    private boolean type;
    private int price;
    private Random rand = new Random();
    private boolean availability[][] = new boolean[5][10];

    public Movie(String n, boolean t, int p){
        name = n;
        type = t;
        // 3d = true;
        price = p;
        for (int x = 0; x < 5; x++){
            for (int y = 0; y < 10; y++){
                availability[x][y] = true;
            }
        }
    }



    public void setSeat(int x, int y, boolean set){
        availability[x][y] = set;
    }

    public boolean display(int x, int y){
        return availability[x][y];
    }

    public void randomizer(){
        for (int x = 0; x < 5; x++){
            for (int y = 0; y < 10; y++){
                availability[x][y] = rand.nextBoolean();
            }
        }
    }

    public void displayAll(){
        System.out.print("  ");
        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int x = 0; x < 5; x++){
            switch (x){
                case 0:
                    System.out.print("A ");
                    break;
                case 1:
                    System.out.print("B ");
                    break;
                case 2:
                    System.out.print("C ");
                    break;
                case 3:
                    System.out.print("D ");
                    break;
                case 4:
                    System.out.print("E ");
                    break;
            }

            for (int y = 0; y < 10; y++){
                System.out.print(availability[x][y] ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

    public String[] returnStats(){
        String returnList[] =  {this.name, (type?"3D":"2D"), ((price/100.0)+ "")};
        return returnList;
    }

    public void returnStatsP(){
        System.out.println(this.name + " " + (type?"3D":"2D") + " " + ((price/100.0)+ ""));

    }
}