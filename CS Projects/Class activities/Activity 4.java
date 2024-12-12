import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = true;
        boolean e = true;
        Scanner scan = new Scanner(System.in);
        String inp;
        System.out.println("Vegan? ");
        inp = scan.nextLine();
        if (inp.compareTo("yes") == 0) {
            a = false;
            b = false;
            d = false;
        }
        System.out.println("Vegitarian? ");
        inp = scan.nextLine();
        if (inp.compareTo("yes") == 0) {
            a = false;
        }
        System.out.println("Gluten-free? ");
        inp = scan.nextLine();
        if (inp.compareTo("yes") == 0) {
            a = false;
            d = false;
        }
        if (a){
            System.out.println("Joe's");
        }
        if (b){
            System.out.println("Main");
        }
            System.out.println("Corner");
        if (d){
            System.out.println("Mama's");
        }
        System.out.println("Chef's");
    }
}