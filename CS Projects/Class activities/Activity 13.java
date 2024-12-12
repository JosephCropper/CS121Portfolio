import java.util.Random;
public class Main {
    public static void main(String[] args){
        Movie tfo = new Movie("Transformers_One", true, 1576);
        Movie ddp = new Movie("Deadpool_III", false, 2169);
        Movie wrb = new Movie("The_Wandering_Robot", true, 1700);

        tfo.returnStats();

        System.out.println("--------------------------------");
        tfo.displayAll();
        System.out.println("--------------------------------");
        tfo.randomizer();

        tfo.displayAll();
        System.out.println("--------------------------------");
    }
}

class Movie{
    private String name;
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
        for (int x = 0; x < 5; x++){
            for (int y = 0; y < 10; y++){
                System.out.print(availability[x][y] ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

    public void returnStats(){
        System.out.println("Name: " + this.name + "\t" + (type?"3D":"2D") + "\t$" + (price/100.0));
    }
}