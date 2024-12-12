package weektwo;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.InputMismatchException;


public class ClassActivity1 {
    public static void main(String[] args){
        //ScannerInterest.scannerInterest();
        DialogBoxInterest.dialogBoxInterest();
    }
}

class ScannerInterest{
    public static void scannerInterest(){
        Scanner scan = new Scanner(System.in);
        double principle, years, rate;
        int numberPerYear = 0;

        System.out.print("Principle amount: ");
        principle = scan.nextDouble();
        System.out.print("Rate of Interest: ");
        rate = (scan.nextDouble() / 100);
        while (numberPerYear == 0) {
            System.out.print("Number of Compounds per Year: ");
            try {
                numberPerYear = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\t!! Input must be an Integer amount !!");
                scan.nextLine();
            }
        }
        System.out.print("Number of Years in Account: ");
        years = scan.nextDouble();

        System.out.printf("\nEnd Amount: %.3f", ScannerInterest.endAmount(principle, rate, years, numberPerYear));
    }

    public static double endAmount(double p, double r, double y, int n){
        return(p *Math.pow((1+ (r / n)), (n * y)));
    }
}

class DialogBoxInterest{
    public static void dialogBoxInterest(){
        double principle, years, rate;
        int numberPerYear = 0;
        JOptionPane pane = new JOptionPane();
        principle = Double.parseDouble(JOptionPane.showInputDialog("Enter Principle: "));
        years = Double.parseDouble(JOptionPane.showInputDialog("Enter Years in Account: "));
        rate = (Double.parseDouble(JOptionPane.showInputDialog("Enter Rate of Interest: "))/100);
        while (numberPerYear == 0){
            try {
                numberPerYear = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Compounds per Year: "));
            }
            catch(InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Input Must Be An Integer!");
            }
        }
        JOptionPane.showMessageDialog(null, (endAmount(principle, rate, years, numberPerYear)));
    }

    public static double endAmount(double p, double r, double y, int n){
        return(p *Math.pow((1+ (r / n)), (n * y)));
    }
}
