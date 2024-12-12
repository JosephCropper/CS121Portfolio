import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        People[] people = new People[3];
        for (int i = 0; i < 3; i++){
            people[i] = new People();
            System.out.println("Enter name: ");
            people[i].name = scan.next();
            System.out.println("Enter age: ");
            people[i].age = scan.nextInt();
            System.out.println("Enter grade: ");
            people[i].grade = scan.nextDouble();
        }
        System.out.println("NAME   AGE   GRADE");
        for (int i = 0; i < 3; i++){
            people[i].print();
        }

    }
}

class People{

    public String name;
    public int age;
    public double grade;


    public void print(){
        System.out.println(this.name + "\t" + this.age + "\t" + this.grade);
    }
}