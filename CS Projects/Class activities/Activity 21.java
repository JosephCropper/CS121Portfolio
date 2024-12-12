import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SystemManagement a = new SystemManagement();
        a.setListone();
        a.setListtwo();
        a.setListthree();

        a.getListone();
        a.getListtwo();
        a.getListthree();

        a.listone.remove(1);
        a.listone.add("oc31");

        a.getListone();
        System.out.println(a.listtwo.get(1));

        TestCustomerInfo tets = new TestCustomerInfo();
    }
}

class SystemManagement{
    ArrayList listone;
    ArrayList<String> listtwo;
    ArrayList<Integer> listthree;

    public SystemManagement() {
        listone = new ArrayList();
        listtwo = new ArrayList();
        listthree = new ArrayList();
    }

    public void setListone() {
        listone.add("a");
        listone.add(1);
        listone.add(15.5);
    }

    public void getListone(){
        System.out.println("----------------------");
        for (int i = 0; i < listone.size(); i++){
            System.out.println(listone.get(i));
        }
    }

    public void setListtwo(){
        listtwo.add("B");
        listtwo.add("C");
        listtwo.add("AAAAAAAAAAAAAAAAAAAAAAA");
    }

    public void getListtwo(){
        System.out.println("----------------------");
        for (String i : listtwo){
            System.out.println(i);
        }
    }

    public void setListthree(){
        listthree.add(100);
        listthree.add(15);
        listthree.add(1);
    }

    public void getListthree(){
        System.out.println("----------------------");
        for (Integer i : listthree){
            System.out.println(i);
        }
    }
}

class TestCustomerInfo{
    Scanner scan = new Scanner(System.in);
    ArrayList<String> array = new ArrayList();
    public TestCustomerInfo(){
        System.out.println("Initializing Customer info. Enter info. \"q\" to print");
        String a = scan.next();
        while (a.compareTo("q") != 0){
            array.add(a);
            System.out.println(a + " added. Enter info: ");
            a = scan.next();
        }
        System.out.println("Printing info... ");
        for (String i : array){
            System.out.println(i);
        }
    }
}