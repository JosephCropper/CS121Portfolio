import java.util.Scanner;
import java.util.Arrays;

enum accType{
    Checking, Saving;
}

public class Main {
    public static void main(String args[]){

        BankAccount acc1 = new BankAccount("BAName", accType.Checking, 10.00);
        System.out.println(Arrays.toString(acc1.tostring()));

        BankAccount acc2 = new Regular("RName", accType.Saving, 15.00, 50);
        System.out.println(Arrays.toString(acc2.tostring()));

        BankAccount acc3 = new Premium("PName", accType.Saving, 20.00, 100.00);
        System.out.println(Arrays.toString(acc3.tostring()));

    }
}

class BankAccount{

    protected String accountHolder;
    protected accType accountType;
    protected double balance = 0.0;

    public BankAccount(String inName, accType inAccType, double inBalance){
        accountHolder = inName;
        accountType = inAccType;
        balance = inBalance;
    }

    public String[] tostring(){
        return new String[]{accountHolder, accountType.toString(), balance+""};
    }
}

class Regular extends BankAccount{
    private int age;

    public Regular(String inName, accType inAccType, double inBalance, int inAge) {
        super(inName, inAccType, inBalance);
        accountHolder = inName;
        accountType = inAccType;
        balance = inBalance;
        age = inAge;
    }

    public String[] tostring(){
        return new String[]{accountHolder, accountType.toString(), balance+"", age+""};
    }
}

class Premium extends BankAccount{
    private double creditLimit;

    public Premium(String inName, accType inAccType, double inBalance, double inCredLimit) {
        super(inName, inAccType, inBalance);
        accountHolder = inName;
        accountType = inAccType;
        balance = inBalance;
        creditLimit = inCredLimit;
    }

    public String[] tostring(){
        return new String[]{accountHolder, accountType.toString(), balance+"", creditLimit+""};
    }
}
