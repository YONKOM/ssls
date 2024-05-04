/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(" .   ");
        System.out.println(" .  .");
        System.out.println(" .   .");
        System.out.println(" .    .");
        System.out.println("y.     . z");
        System.out.println(" .      .");
        System.out.println(" .       .");
        System.out.println(" ..........");
        System.out.println("     x ");

        System.out.println("this triangle above, enter its adjacent and opposite values ewpectivly:   ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
double z =  Math.sqrt((x*x)+(y*y));
        System.out.println("so the hypotenuse of this triangle is " + z);
    }
}


*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int diff(int a, int b) {
        return a - b;
    }

    static int multdiff(int A, String B) {
        // This function needs to be implemented
        return A;
    }

    static String expdiff(int AA, String BB, int ex) {
        int res = (ex * AA);
        int res2 = (ex - 1);
        return(res + BB + "^" + res2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose any diff operation: ");
        System.out.println("1. num and num");
        System.out.println("2. num and variable");
        System.out.println("3. num and sub variable");
        int choice = scan.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter two numbers: ");
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println("=" + diff(a, b));
                break;
            case 2:
                System.out.print("Enter the formula: ");
                int A = scan.nextInt();
                System.out.print("  ");
                String B = scan.nextLine();
                System.out.print("  ");
                System.out.println(multdiff(A, B));
                break;
            case 3:
                System.out.print("Enter the formula: ");
                int AA = scan.nextInt();
                System.out.print("  ");
                String BB = scan.nextLine();
                System.out.print("  ");
                int ex = scan.nextInt();
                System.out.println(expdiff(AA, BB, ex));
                break;
        }
    }
}
