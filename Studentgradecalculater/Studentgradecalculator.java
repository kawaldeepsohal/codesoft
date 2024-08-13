package Studentgradecalculater;

import java.util.Scanner;

public class Studentgradecalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Student Grade Calculator!");

        // Input number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Array to store marks
        double[] marks = new double[numberOfSubjects];

        // Input marks
        for (int i = 0; i <=numberOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextDouble();
        }

        // Calculate total marks
        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }

        // Calculate average percentage
        double averagePercentage = (totalMarks / (numberOfSubjects * 100)) * 100;

        // Determine grade
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Output results
        System.out.printf("Total Marks: %.2f%n", totalMarks);
        System.out.printf("Average Percentage: %.2f%%%n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
