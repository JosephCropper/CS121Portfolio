import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of elements: ");
        int[][] arrays = new int[4][scan.nextInt()];
        for (int i = 0; i < (arrays[0].length + 4); i++) {
            if (i < arrays[0].length) {
                System.out.println("Enter number: ");
                arrays[0][i] = scan.nextInt();
                arrays[1][i] = arrays[0][i];
                arrays[2][i] = (arrays[0][i] * arrays[0][i]);
                arrays[3][arrays[0].length - (i + 1)] = arrays[0][i];
            }
            else{
                System.out.println("\nArray " + ((i + 1) - arrays[0].length ));
                for(int x = 0; x < arrays[0].length; x++){
                    System.out.print(" " + arrays[(i - arrays[0].length)][x]);
                }
            }
        }

    }
}