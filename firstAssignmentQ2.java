 import java.util.*;
public class firstAssignmentQ2 {
    public static void main (String [] args) {
        
        
        Scanner num = new Scanner(System.in);
        Scanner sName = new Scanner(System.in);
        Scanner sGrade = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numOfStudents = num.nextInt();
        
        String [] studentName = new String [numOfStudents];
        double [] studentGrade = new double [numOfStudents];
        
        
        for(int i=0; i<numOfStudents; i++) {
            System.out.print("Student name: ");
            studentName[i] = sName.nextLine();
            System.out.print("Student grade out of 100: ");
            studentGrade[i] = sGrade.nextDouble(); 
            if (studentGrade[i]>100) {
                System.out.println("The grade must be equal or less han 100, please enter the grade again: ");
                studentGrade[i] = sGrade.nextDouble(); } 
            System.out.println(" "); } 
            
        double max=studentGrade[0];
        int maxIndex=0;
        for(int i=1; i<numOfStudents; i++) {
            if(max<studentGrade[i]) {
                max=studentGrade[i]; 
                maxIndex=i;}
        }
        
        System.out.println(" ");
        System.out.println("The student with the highest grade is: " + studentName[maxIndex] );
        
        double sum=studentGrade[0];
        for(int i=1; i<numOfStudents; i++){
            sum+=studentGrade[i];
        }
        double avg=(sum/numOfStudents);
        
        int lessThanAvg=0;
        for(int i=0; i<numOfStudents; i++) {
            if(studentGrade[i]<avg) {
                lessThanAvg++; }
        }
        System.out.println(" ");
        System.out.println("The number of students less than the average is: " + lessThanAvg);
        
    }
}



