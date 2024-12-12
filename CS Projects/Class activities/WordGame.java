package Wk2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String loop = "Age", name = "Name", city = "City", college = "College", major = "Major", animal = "Animal", petName = "Pet Name";
        int age;

        System.out.print("Enter Name: ");
        name = scan.next();
        System.out.print("Enter Age: ");
        age = scan.nextInt();
        System.out.print("Enter City: ");
        city = scan.next();
        System.out.print("Enter College: ");
        college = scan.next();
        System.out.print("Enter Animal: ");
        animal = scan.next();
        System.out.print("Enter Major: ");
        major = scan.next();
        System.out.print("Enter Pet Name: ");
        petName = scan.next();


        System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ",\n" + name + " went to college at " + college + ". " + name + " graduated with a major in " + major + ".\nThen, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived happily ever after!");


    }
}
