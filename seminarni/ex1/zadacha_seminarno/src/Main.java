import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a grade: ");
        double grade = Double.parseDouble(sc.nextLine());
        printGrade(grade);

    }
     static void printGrade(double grade){
        if(grade>=2 && grade<=2.99){
            System.out.println("Fail");
        }
        else if(grade>2.99 && grade<=3.49){
            System.out.println("Poor");
        }
        else if(grade>3.49 && grade<=4.49){
            System.out.println("Good");
        }
        else if(grade>4.49 && grade<=5.49){
            System.out.println("Very good");
        }
        else if(grade>5.49 && grade<=6.00){
            System.out.println("Excellent");
        }
     }
}
