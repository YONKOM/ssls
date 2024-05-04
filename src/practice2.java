import java.util.Scanner;
import java.util.InputMismatchException;
public class practice2 {
    static void mamthcalclator(){
        Scanner scan = new Scanner(System.in);
        System.out.println("which operation you want?");
        System.out.println("1.basic calc (+,-,*,/)");
        System.out.println("2.trigonometric calc");
        System.out.println("3.quadratic calc");
        System.out.println("4.basic intergation or differentiation");
        int choicee = scan.nextInt();
        if(choicee==1){
            System.out.println("enter your two numbers");
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            System.out.printf("%f x %f = %f",a, b, (a*b));
            System.out.printf("%f + %f = %f",a, b, (a+b));
            System.out.printf("%f - %f = %f",a, b, (a-b));
            System.out.printf("%f / %f = %f",a, b, (a/b));

        }
        else if(choicee == 2){
            
        }



    }
    static void gradeevalutation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("what system grade youre performing?");
        System.out.println("1.from % to 4 grade ");
        System.out.println("2. from 4 grade to %");
        int system = scan.nextInt();
        if (system == 1) {
            int percent;
            System.out.println("enter your percent");
            percent = scan.nextInt();
            switch (percent) {
                case 90:
                    System.out.println("your grade is 4.0 which is AA!");
                    break;
                case 80:
                    System.out.println("your grade is 3.5 which is BA!");
                    break;
                case 70:
                    System.out.println("your grade is 3.0 which is BB!");
                    break;
                case 60:
                    System.out.println("your grade is 2.5 which is CB!");
                    break;
                case 50:
                    System.out.println("your grade is 2.0 which is CC!");
                    break;
                case 40:
                    System.out.println("your grade is 1.5 which is DC!");
                    break;
                case 30:
                    System.out.println("your grade is 1.0 which is DD!");
                    break;
                case 20:
                    System.out.println("your grade is 0.5 which is FD!");
                    break;
                case 10:
                    System.out.println("your grade is 0.0 which is FF!");
                    break;
                default:
                    System.out.println("Invalid percentage, you have to write it as a ten");
                    break;
            }
        } else if (system == 2) {
            double grade;
            System.out.println("enter your 4 grade");
            grade = scan.nextDouble();
            if (grade == 4.0) {
                System.out.println("your percent is 90% which is AA!");
            } else if (grade == 3.5) {
                System.out.println("your percent is 80% which is AA!");
            } else if (grade == 3.0) {
                System.out.println("your percent is 70% which is AA");
            } else if (grade == 2.5) {
                System.out.println("your percent is 60% which is AA");
            } else if (grade == 2.0) {
                System.out.println("your percent is 50% which is AA");
            } else if (grade == 1.5) {
                System.out.println("your percent is 40% which is AA");
            } else if (grade == 1.0) {
                System.out.println("your percent is 30% which is AA");
            } else if (grade == 0.5) {
                System.out.println("your percent is 20% which is AA");
            } else if (grade == 0) {
                System.out.println("your percent is 10% which is AA");
            } else {
                System.out.println("Invalid percentage");
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("hello and welcome to our math project!" +
                " this project is designed to help students manage thier finances," +
                " figure out their school grade, or evaluate their academic knowledge in math");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("this project is also desgined to use a calculator for math");
        System.out.println("lets start with a basic introduction of yourself!");
        System.out.println("whats your name? ");
        String name = scan.nextLine();
        System.out.println("whats your student id number? ");
        String studentId = scan.nextLine();
        System.out.println("------------------------------------------------------------");
        System.out.printf("nice having you with us :)\n" +"||" +name + studentId+ "||");
        System.out.println("------------------------------------------------------------");
        System.out.println("////////////////////////////////////////////////////////////////");
        System.out.println("what activity do you want to use? ");
        System.out.println("1. math calculator");
        System.out.println("2. currency converting");
        System.out.println("3. school grade evaluation");
        System.out.println("4. quick quiz & level evaluation");
        int coice = scan.nextInt();
        System.out.println("////////////////////////////////////////////////////////////////");

        switch (coice) {

            case 3:
                gradeevalutation();
        }






    }
}
