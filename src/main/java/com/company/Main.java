package com.company;

import java.io.IOException;
import java.util.List;

import static com.company.ProcessingStudents.readToListStudent;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            String fileName = "/Users/nikita/Documents/Hometask/Programming/Java/Hometask-9/Hometask-9/Students.txt";
            ProcessingStudents studentList = readToListStudent(fileName, " ");

           //for (int i = 0; i < studentList.getSizeOfStudentList(); ++i) {
             //   System.out.print(studentList.getStudent(i));
           //}

           System.out.println(studentList.getStudent(0));

            //studentList.printListOfStudents();
        }
        catch (Exception ex) {
            System.out.println("Error :" + ex.getMessage());
        }
    }
}
