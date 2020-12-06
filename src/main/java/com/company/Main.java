package com.company;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static com.company.Student.*;


public class Main {
    public static void main(String[] args) throws IOException {
        try {
            String fileName = "/Users/nikita/Documents/Hometask/Programming/Java/Hometask-9/Hometask-9/Students.txt";
            List<Student> studentList = readToListStudent(fileName, " ");

            System.out.println("Do you want to see list of students?\n1 - See\n2 - Skip");
            System.out.print("Enter: ");
            Scanner in = new Scanner(System.in);
            int variantSee = in.nextInt();
            if (variantSee == 1) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
                printListOfStudents(studentList);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            }

            System.out.println("1 - Find student by average mark\n2 - Find student by gender\n3 - Find student by faculty\n");
            System.out.print("Enter: ");
            int variantChoise = in.nextInt();
            switch (variantChoise) {
                case 1 -> {
                    System.out.print("Enter average mark: ");
                    double averageMarkStudent = in.nextDouble();
                    findStudentByAverageMark(studentList, averageMarkStudent);
                }

                case 2 -> {
                    System.out.println("Enter gender: (1 - male, 2 - female) : ");
                    int variantGender  = in.nextInt();
                    //in.next();
                    System.out.println("\n");
                    findStudentByGender(studentList, variantGender);
                }

                case 3 -> {
                    System.out.println("Enter faculty: ");
                    String variantString  = in.nextLine();
                    System.out.println("Faculty: " + variantString);
                    System.out.println("\n");
                    findStudentByFaculty(studentList, variantString);
                }
            }

            System.out.println("End of program\n");
        }
        catch (Exception ex) {
            System.out.println("Error :" + ex.getMessage());
        }
    }
}
