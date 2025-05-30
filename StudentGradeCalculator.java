import java.util.Scanner;


public class StudentGradeCalculator {


   
    public static void main(String[] args) {
        
        System.out.println("----------Welcome to Student Score Analyzer!!----------");
        System.out.println("Let's calculate your total score, average percentage, and final grade.\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        if(numSubjects <= 0){
            System.out.println("Please enter a valid number of subjects.");
                sc.close();
                return;

            }
            int totalMarks = 0;
            int maxMarksPerSubject = 100;

            for(int i = 1; i <= numSubjects; i++){
                System.out.print("Enter marks obtained in subject " + i + " (out of 100):");
                int marks = sc.nextInt();

                if(marks < 0 || marks > maxMarksPerSubject){
                    System.out.println("Marks should be in the range of 0 to 100. Please enter valid marks.");
                    i--;
                }
                else{
                    totalMarks += marks;
                }
            }
            sc.close();


            System.out.println("\n-----RESULT Summary-----");

            double averagePercentage = (double) totalMarks / (numSubjects * maxMarksPerSubject)*100;
            System.out.println("Total Marks Obtained: " + totalMarks);
            System.out.printf("Average Percentage: %.2f%%\n" ,averagePercentage);

            String grade;

            if(averagePercentage >= 90){
                grade = "A+";
            }
            else if (averagePercentage >= 80){
                grade = "A";
            }
            else if(averagePercentage >= 70){
                grade = "B";
            }
            else if (averagePercentage >= 60){
                grade = "C";
            }
            else if (averagePercentage >= 50){
                grade = "D";
            }
            else{
                grade = "F";
            }

        System.out.println("Final Grade: " + grade);
        System.out.println(" ");
        


    }
}