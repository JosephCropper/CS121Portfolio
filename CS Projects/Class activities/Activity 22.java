import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LibraryMember a = new LibraryMember("Aname", "name@gmail.com", new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 0.00, new LinkedList<String>());
        LibraryMember b = new LibraryMember("Anothur Naem", "email.yahoo.com", new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 2}, 0.01, new LinkedList<String>());
        a.addBorrowedBook("Book");
        a.addBorrowedBook("Book2 : the sequel");
        a.returnBorrowedBook();
        a.addBorrowedBook("Book3: The prequel");
        a.addBorrowedBook("Book4: Cheap knockoff reboot cashgrab that will kill the fanbase");
        a.addBorrowedBook("Book5: the fifth");
        System.out.println(a.getMemberInfo());
        a.printBookList();

        b.addBorrowedBook(("Book"));
        b.addBorrowedBook("Book");
        b.addBorrowedBook("Book3: the prequel");
        b.returnBorrowedBook();
        b.addBorrowedBook("Book2: the sequel");
        System.out.println(b.getMemberInfo());
        b.printBookList();
    }
}

class LibraryMember{
    private String name, email;
    private int[] number;
    private double replacementFee;
    private LinkedList<String> borrowedBookList;

    private Scanner scan = new Scanner(System.in);

    public LibraryMember(String n, String e, int[] num, double f, LinkedList<String> b){
        name = n;
        email = e;
        number = num;
        replacementFee = f;
        borrowedBookList = b;
    }

    public void addBorrowedBook(String book){
        borrowedBookList.add(book);
    }

    public void returnBorrowedBook(){
        printBookList();

        String input = "";
        System.out.println("Enter the index of the book that has been returned. \"q\" to quit. ");

        do{

            input = scan.next();

            try{

                borrowedBookList.remove((Integer.valueOf(input) - 1));
                printBookList();

            }
            catch (Exception e){

                switch (input){
                    case "q":
                        System.out.println("Quitting...");
                        break;
                    default:
                        System.out.println("Incorrect input, please try again.");
                        break;
                }

            }

        }
        while (input.compareTo("q") != 0);
    }

    public String getMemberInfo(){
        String returnString =
                ("Name: " + name +
                "\nContact: " + email + " | ");
        for (int i = 0; i < number.length; i++){
            returnString = returnString + "" + number[i];
        }
        returnString = returnString + ("\nFee: " + replacementFee);
        return returnString;
    }

    public void printBookList(){
        System.out.println(name + "\'s borrowed books:\n--------------------------\nIndex | Title");
        for (int x = 1; x <= borrowedBookList.size(); x++){
            System.out.println("   " + x + " | " + borrowedBookList.get((x-1)));
        }
    }

    public LinkedList<String> getBorrowedBookList(){
        return borrowedBookList;
    }

}