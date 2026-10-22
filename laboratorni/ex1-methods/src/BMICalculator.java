import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            printIntroduction();
            int personNum = 1;
            double bmi = getBMI(scanner);
            String status = getStatus(bmi);
            reportResult(personNum, bmi, status);


            scanner.close();
        }
        public static void printIntroduction(){
            System.out.println("Hello! This is BMI calculator");
        }
        public static double getBMI(Scanner sc){
            System.out.println("Please enter your weight in pounds: ");
            double weight=Double.parseDouble(sc.nextLine());
            System.out.println("Please enter your height in inches: ");
            double height=Double.parseDouble(sc.nextLine());
            return bmiFor(weight,height);

        }
        public static double bmiFor(double weight,double height){
            double index=weight*703/ (height*height);
            return index;
        }
        public static String getStatus(double index){
            String result="";
            if(index<=18.5){
                result+="underweight";
            }
            else if(index<=25){
                result +="normal";
            }
            else if(index<=30){
                result+="overweight";
            }
            else{
                result+="obese";
            }
            return result;
        }
        public static void reportResult(int num,double index,String status){
            System.out.printf("The %d has BMI index: %.2f. The status is: %s",num,index,status);
        }
    }
