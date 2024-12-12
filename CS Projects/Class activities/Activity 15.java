public class Main{
    public static void main(String args[]){
    Innit innt = new Innit();
    innt.main();
    }
}

class Innit{
    public void main(){
        ClassOne tc1 = new ClassOne();
        ClassTwo tc2 = new ClassTwo('a', 'b', 'c');
        System.out.println(tc1.toString() +"\n"+ tc2.toString());
    }
}
class ClassOne{
    private int variableOne, variableTwo;
    public String variableThree;
    public ClassOne(){
        variableOne = 0;
        variableTwo = 1;
        variableThree = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    }

    public String toString(){
        return("" + variableOne + " " + variableTwo +" " + variableThree);
    }
}

class ClassTwo{
    private char v1, v2, v3;
    public ClassTwo(char one, char two, char three){
        v1 = one;
        v2 = two;
        v3 = three;
    }

    public String toString(){
        return(v1 + " " + v2 + " " + v3);
    }
}