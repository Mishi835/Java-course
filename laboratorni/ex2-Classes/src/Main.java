import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a company name: ");
        String name=sc.nextLine();
        System.out.println("Please enter a establishment date: ");
        String establishmentDate=sc.nextLine();
        System.out.printf("Please enter the bulstat of the %s company. It has to be 10 symbols:\n",name);
        String bulstat=sc.nextLine();
        Company company=new Company(name,establishmentDate,bulstat);
        System.out.println("The name of the company: "+company.getCompanyName());


        sc.close();
    }
}
