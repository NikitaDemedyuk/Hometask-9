package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Locale.filter;

public class ProcessingStudents {
    private List<Student> studentList;

    public ProcessingStudents(List <Student> studentListSet) {
        studentList = studentListSet;
    }

    @Override
    public String toString () {
        for (int i = 0; i < studentList.size(); ++i) {
            this.studentList.toString();
        }
    }

    public int getSizeOfStudentList() {
        return this.studentList.size();
    }

    public Student getStudent(int index) {
        return this.studentList.get(index);
    }

    public static ProcessingStudents readToListStudent(String fileName, String delimeter) throws IOException {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            List<String> stringList = new ArrayList();
            while ((line = br.readLine()) != null) {
                stringList.add(line);
            }
            br.close();
            fr.close();
            List<List<String>> stringListStudents = new ArrayList();
            for (int i = 0; i < stringList.size(); ++i) {
                stringListStudents.add(Arrays.asList(stringList.get(i).split(delimeter)));
            }
            List <Student> studentListN = new ArrayList<>();

            for (int i = 0; i < stringListStudents.size(); ++i) {
                 Student student = new Student(Integer.parseInt(stringListStudents.get(i).get(0)), stringListStudents.get(i).get(1), stringListStudents.get(i).get(2), stringListStudents.get(i).get(3),
                         stringListStudents.get(i).get(4), Integer.parseInt(stringListStudents.get(i).get(5)), stringListStudents.get(i).get(6));

                 studentListN.add(student);
            }

            ProcessingStudents studentList = new ProcessingStudents(studentListN);
            return studentList;
    }

    public void findByDateOfBirth(int dateOfBirthStudent) {
        this.studentList.stream()
          .filter(p -> p.getYearOfBirth() == dateOfBirthStudent)
                .forEach(System.out::println);
    }

    public void static
}



