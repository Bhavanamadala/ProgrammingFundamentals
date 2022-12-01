package com.bhavana.Student;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudentGrade {
    public static void main(String[] args) {
        int count = 4;
        float percentage, average, totalMarks = 0;
        int[] studentOneGrades = {78, 89, 78, 80};
        int[] studentTwoGrades = {78, 67, 68, 92};
        int[] studentThreeGrades = {88, 92, 92, 94};
        String[] students = {"bhavana", "paddulu", "vassu"};
        Scanner userInput = new Scanner(System.in);
        System.out.println("Student Names: " + Arrays.toString(students));
        System.out.print("Enter a student's name:");
        String selectedStudentName=userInput.nextLine();
        if (selectedStudentName.equals("bhavana")) {
            System.out.println("grades is :" + Arrays.toString(studentOneGrades));

            for (int i = 0; i < count; i++) {
                totalMarks += studentOneGrades[i];
            }
            System.out.println("total Marks =" + totalMarks);

            percentage = (totalMarks / (count * 100)) * 100;
            System.out.println("percentage"+percentage);
            average = percentage / 10;
            if (average > 9) {
                System.out.println("grade A");
            } else if (average > 8) {
                System.out.println("grade B");
            } else if (average > 7) {
                System.out.println("grade c");
            } else if (average > 6) {
                System.out.println("grade d");
            } else if (average < 5) {
                System.out.println("fail");
            }

        }else
        if (selectedStudentName.equals("paddulu")){
            System.out.println("grades is :" + Arrays.toString(studentTwoGrades));
            for (int i = 0; i < count; i++) {
                totalMarks += studentTwoGrades[i];
            }
            System.out.println("total Marks =" + totalMarks);

            percentage = (totalMarks / (count * 100)) * 100;
            System.out.println("percentage"+percentage);
            average = percentage / 10;
            if (average > 9) {
                System.out.println("grade A");
            } else if (average > 8) {
                System.out.println("grade B");
            } else if (average > 7) {
                System.out.println("grade c");
            } else if (average > 6) {
                System.out.println("grade d");
            } else if (average < 5) {
                System.out.println("fail");
            }


        }if(selectedStudentName.equals("vassu")) {
            System.out.println("grades is :" + Arrays.toString(studentThreeGrades));
            for (int i = 0; i < count; i++) {

                totalMarks += studentThreeGrades[i];
            }
            System.out.println("total Marks =" + totalMarks);

            percentage = (totalMarks / (count * 100)) * 100;
            average = percentage / 10;



            if (average > 9) {
                System.out.println("grade A");
            } else if (average > 8) {
                System.out.println("grade B");
            } else if (average > 7) {
                System.out.println("grade c");
            } else if (average > 6) {
                System.out.println("grade d");
            } else if (average < 5) {
                System.out.println("fail");
            }
        }


    }
}
