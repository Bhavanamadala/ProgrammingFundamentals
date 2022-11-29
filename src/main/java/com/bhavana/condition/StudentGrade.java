package com.bhavana.condition;

import java.util.Scanner;

public class StudentGrade {
public static void main(String args[]){
    int marks;
    Scanner sc=new Scanner(System.in);
    System.out.print(" enter the english marks:");
    marks = sc.nextInt();
    if(marks >80){
        System.out.print("grade is A");
    } else if (marks>=60 && marks<80) {
        System.out.print("grade is B ");
        
    } else if (marks>=50 && marks<60) {
        System.out.print("grade is C ");
        
        
    } else if (marks>=45 && marks<50) {
        System.out.print("grade is D");
        
    } else if (marks>=25 && marks<45) {
        System.out.print("grade is E ");
        
    }else {
        System.out.print("grade is F ");

    }
}
}
