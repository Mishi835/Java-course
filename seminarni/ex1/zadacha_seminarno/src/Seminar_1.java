import java.util.Scanner;

public class Seminar_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the students: ");
        int n= Integer.parseInt(sc.nextLine());
        String[] facultyNumber=new String[n];
        int[] grades=new int[n];

        //calling methods
        readResults(facultyNumber,grades);
        printResults(facultyNumber,grades);
        System.out.println("The count of the failed students: " + countFailedStudents(grades));
        printFailedStudents(facultyNumber,grades);
        System.out.println("The average score of the class is: " + calculateAverageGrade(grades));
        printTopStudents(facultyNumber,grades);
    }
    public static void readResults(String[] facultyNum,int[] grades){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the information: ");
        for(int i=0; i<facultyNum.length;i++){
            String[] info=sc.nextLine().split(" ");
            facultyNum[i]=info[0];
            grades[i]=Integer.parseInt(info[1]);
        }

    }
    public static void printResults(String[] facultyNum, int[] grade){
        System.out.println("Info: ");
        for(int i=0;i<facultyNum.length;i++){
            System.out.println("Fac №: "+facultyNum[i] + ", " + "grade: "+grade[i]);
        }
    }
    public static int countFailedStudents(int[] grades){
        int count=0;
        for(int i=0;i<grades.length;i++){
            if(grades[i]==2) {
                count++;
            }
        }
        return count;
    }
    public static void printFailedStudents(String[] facultyNumbers, int[] grades){
        String result="";
        for(int i=0;i<grades.length;i++){
            if(grades[i]==2) {
                if(!result.isEmpty()){
                    result+=", ";
                }
                result+=facultyNumbers[i];

            }
        }
            System.out.println("Fac numbers of the failed students: " + result);
    }
    public static double calculateAverageGrade(int[] grades) {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            sum += grade;
        }
        double average;
        if(grades.length!=0){
            average=sum/grades.length;
        }
        else {
            throw new Error("undefiend");
        }
        return average;
    }
    public static void printTopStudents(String[] facultyNumbers, int[] grades){
        int maxGrade=grades[0];
        int indexTop=0;
        for(int i=1;i<grades.length;i++){
            if(grades[i]>maxGrade) {
                maxGrade = grades[i];
                indexTop = i;
            }
        }
        System.out.println("The student with the highest score is: " + facultyNumbers[indexTop]);
    }
}
