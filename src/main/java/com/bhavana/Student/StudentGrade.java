package com.bhavana.Student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        int count =4;
        float totalMarks =0,percentage,average;
        int[] studentOneGrades = {78, 89, 78, 80};
        int[] studentTwoGrades = {78, 67, 68, 92};
        int[] studentThreeGrades = {88, 92, 92, 94};

        String[] students = {"paddulu", "vassu", "bhavs"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Names: " + Arrays.toString(students));
        System.out.print("Enter a student's name:");
        String selectedStudentName = scanner.nextLine();
        if (selectedStudentName.equals("paddulu")){
            System.out.println("grades is :"+Arrays.toString(studentOneGrades));
            for(int i=1;i<count;i++){
                totalMarks += studentOneGrades[i];
            }
            System.out.println("totalMarks is:"+totalMarks);
            percentage =(totalMarks/400)*100;
            System.out.println("percentage is :"+ percentage);


        }
        if(selectedStudentName.equals("vassu")){
            System.out.println("grade is :"+Arrays.toString(studentTwoGrades));
            for(int i=1;i<count;i++){
                totalMarks += studentTwoGrades[i];
            }
            System.out.println("totalMarks is:"+totalMarks);
            percentage =(totalMarks/400)*100;

            System.out.println("percentage is :"+ percentage);


        }
        if(selectedStudentName.equals("bhavs")){
            System.out.println("grade is :"+Arrays.toString(studentThreeGrades));
            for(int i=1;i<count;i++){
                totalMarks += studentThreeGrades[i];
            }
            System.out.println("totalMarks is:"+totalMarks);
            percentage =(totalMarks/400)*100;

            System.out.println("percentage is :"+ percentage);

        }
        System.out.print("The student Grade is: ");
        percentage =(totalMarks/400)*100;
        if(percentage>=80)
        {
            System.out.print("A");
        }
        else if(percentage>=60 && percentage<80)
        {
            System.out.print("B");
        }
        else if(percentage>=40 && percentage<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }

    }

}
