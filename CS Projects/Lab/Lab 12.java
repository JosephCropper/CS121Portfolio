import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        DataStructure obj = new DataStructure();
        obj.addStudent("S1");
        obj.addStudent("S2");
        obj.addStudent("S3");
        obj.addStudentAge(20);
        obj.addStudentAge(25);
        obj.addStudentAge(30);
        obj.addStudentGpaMajor("CS", 2.00);
        obj.addStudentGpaMajor("BIO", 2.56);
        obj.addStudentGpaMajor("GEN", 2.88);
        obj.addNationality("American");
        obj.addNationality("European");
        obj.addNationality("American");
        obj.addHometown("Indianapolis");
        obj.addHometown("Glasgow");
        obj.addHometown("LA");
        obj.addHomestate("IN");
        obj.addHomestate("Null");
        obj.addHomestate("California");
        System.out.println(obj.toString());
        System.out.println("------");
        obj.removeStudent(1);
        obj.removeAge(1);
        obj.removeGpaMap("BIO");
        obj.removeNationality(1);
        obj.removeTown(1);
        obj.removeState("Null");
        System.out.println(obj.toString());
    }
}

class DataStructure{
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = {-1, -1, -1};
    private int indexl = 0;
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();

    //print
    @Override
    public String toString(){
        return ("[names] : " + studentList.toString() +
                "\n[ages] : " + (ageList[0] == -1?"" : ageList[0]+ ", " )  + (ageList[1] == -1?"" : ageList[1]+ ", " ) + (ageList[2] == -1?"" : ageList[2] ) +
                "\n[major + GPA] : " + majorGpaMap.toString() +
                "\n[nationalites] : " + nationalityList.toString() +
                "\n[hometowns] : " + hometownStack.toString() +
                "\n[homestates] : " + homeStateQueue.toString());
    }

    // remove all
    public void removeStudent(int key){
        try{
            studentList.remove(key);
        }
        catch (Exception e){System.out.println("ErrC1");}
    }

    public void removeAge(int key) {
        try {
            ageList[key] = -1;
            indexl = key;
        }
        catch(Exception e){System.out.println("ErrC2");}
    }


    public void removeGpaMap(String key){
        try {majorGpaMap.remove(key);}
        catch(Exception e){System.out.println("ErrC3");}
    }


    public void removeNationality(int key){
        try{nationalityList.remove(key);}
        catch(Exception e){System.out.println("ErrC4");}
    }

    public void removeTown(int key){
        try{hometownStack.remove(key);}
        catch(Exception e){System.out.println("ErrC5");}
    }

    public void removeState(String obj){
        try{homeStateQueue.remove(obj);}
        catch(Exception e){System.out.println("ErrC6");}
    }

    // add for all
    public void addStudent(String name){
        studentList.add(name);
    }

    public void addStudentAge(int age){
        ageList[indexl] = age;
        indexl++;
        indexl = (indexl == 3?0 : indexl);
    }

    public void addStudentGpaMajor(String major, Double gpa){
        majorGpaMap.put(major, gpa);
    }

    public void addNationality(String nationality){
        nationalityList.add(nationality);
    }

    public void addHometown(String hometown){
        hometownStack.push(hometown);
    }

    public void addHomestate(String state){
        homeStateQueue.add(state);
    }

}