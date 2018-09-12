package ifelse;

import java.util.Scanner;
public class ResultsStatus {
    public static void main(String[] args) {
        int marksObtained, passingMarks;
        passingMarks = 33;
        Scanner input =new Scanner(System.in);

        System.out.println("Enter the marks obtained by you");
        marksObtained = input.nextInt();

        if(marksObtained >= passingMarks){
            System.out.println("Student is Passed With " + marksObtained + " marks" );
        }else {
            System.out.println("Student is Failed With " + marksObtained + " marks");
        }
    }
}
