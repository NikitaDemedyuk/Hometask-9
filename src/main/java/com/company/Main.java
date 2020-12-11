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
                System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------");
                printListOfStudents(studentList);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            }

            System.out.println("\n1 - Find student by average mark\n2 - Find student by gender\n3 - Find student by faculty\n4 - Find student by favourite subject\n5 - Find student by course\n6 - Find student by color of eyes\n7 - Exit");
            System.out.print("Enter: ");
            int variantChoise = in.nextInt();
            switch (variantChoise) {
                case 1 -> {
                    System.out.print("\nEnter average mark: ");
                    double averageMarkStudent = in.nextDouble();
                    findStudentByAverageMark(studentList, averageMarkStudent);
                }

                case 2 -> {
                    System.out.println("\nEnter gender: (1 - male, 2 - female) : ");
                    int variantGender  = in.nextInt();
                    //in.next();
                    System.out.println("\n");
                    findStudentByGender(studentList, variantGender);
                }

                case 3 -> {
                    System.out.println("\nEnter faculty: ");
                    in.next();
                    String variantString  = in.nextLine();
                    System.out.println("Faculty: " + variantString);
                    System.out.println("\n");
                    findStudentByFaculty(studentList, variantString);
                }

                case 4 -> {
                    System.out.println("\nEnter favourite subject: ");
                    in.next();
                    String variantString  = in.nextLine();
                    System.out.println("FavouriteSubject: " + variantString);
                    System.out.println("\n");
                    findStudentByFavouriteSubject(studentList, variantString);
                }

                case 5 -> {
                    System.out.println("\nEnter course: ");
                    //in.next();
                    int variantCourse  = in.nextInt();
                    System.out.println("Course: " + variantCourse);
                    System.out.println("\n");
                    findStudentByCourse(studentList, variantCourse);
                }

                case 6 -> {
                    System.out.print("\nColor of eyes:\n1 - green\n2 - blue\n3- brown\nEnter: ");
                    int variantColorEyes  = in.nextInt();
                    System.out.println("\n");
                    switch (variantColorEyes) {
                        case 1 -> {
                            findStudentByColorOfEyes(studentList,"green");
                        }
                        case 2 -> {
                            findStudentByColorOfEyes(studentList,"blue");
                        }
                        case 3 -> {
                            findStudentByColorOfEyes(studentList,"brown");
                        }
                    }
                }

                case 7 -> {}
            }

            System.out.println("\nEnd of program\n");
        }
        catch (Exception ex) {
            System.out.println("Error:" + ex.getMessage());
        }
    }
}
