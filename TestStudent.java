
package student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Input number of students: ");
        int numStd = input.nextInt();
        Student std[] = new Student[numStd];
        
        for (int i = 0; i < numStd; i++) {
            System.out.println("Input name of student "+i);
            String recieveName = input.next();
            System.out.println("Input scores of student "+i);
            double recieveScores = input.nextDouble();  
            std[i]= new Student(recieveName, recieveScores); //*
        }
        
        for (int i = 0; i < numStd; i++) {
            System.out.println(std[i].toString());
        }
    }
}
