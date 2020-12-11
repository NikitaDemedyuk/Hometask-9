package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    private int yearOfBirth;
    private String name;
    private String gender;
    private String faculty;
    private double averageMark;
    private String favouriteSubject;
    private int course;
    private String colorEyes;

    public Student(int yearOfBirthStudent, String nameStudent, String genderStudent, String facultyStudent, double averageMarkStudent, String favouriteSubjectStudent,
                   int courseStudent, String colorEyesStudent) {
        yearOfBirth = yearOfBirthStudent;
        name = nameStudent;
        gender = genderStudent;
        faculty = facultyStudent;
        averageMark = averageMarkStudent;
        favouriteSubject = favouriteSubjectStudent;
        course = courseStudent;
        colorEyes = colorEyesStudent;
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + "| Gender: " + this.gender + "| Faculty: " + this.faculty + "| " +"| Average mark: " + this.averageMark +
                "| Favourite subject: " + this.favouriteSubject + "| Course: " + this.gender + "| Color of eyes: " + this.colorEyes);
    }

    public static void printListOfStudents(List <Student> studentList) {
        for (int i = 0; i < studentList.size(); ++i) {
            System.out.println("Name: " + studentList.get(i).name + "| Gender: " + studentList.get(i).gender + "| Faculty: " + studentList.get(i).faculty + "| " +"| Average mark: " + studentList.get(i).averageMark +
                    "| Favourite subject: " + studentList.get(i).favouriteSubject + "| Course: " + studentList.get(i).gender + "| Color of eyes: " + studentList.get(i).colorEyes);
        }
    }

    public static List <com.company.Student> readToListStudent(String fileName, String delimeter) throws IOException {
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
                    Double.parseDouble(stringListStudents.get(i).get(4)), stringListStudents.get(i).get(5), Integer.parseInt(stringListStudents.get(i).get(6)), stringListStudents.get(i).get(7));

            studentListN.add(student);
        }

        return studentListN;
    }

    public static void findByDateOfBirth(List <Student> studentList, int dateOfBirthStudent) {
        studentList.stream()
                .filter(p -> p.getYearOfBirth() == dateOfBirthStudent)
                .forEach(System.out::println);
    }
    
    public void setYearOfBirth (int yearOfBirthStudent) {
        this.yearOfBirth = yearOfBirthStudent;
    }

    public int getYearOfBirth () {
        return this.yearOfBirth;
    }


    public void setName (String nameStudent) {
        this.name = nameStudent;
    }

    public String getName () {
        return this.name;
    }


    public void setGender (String genderStudent) {
        this.gender = genderStudent;
    }

    public String getGender () {
        return this.gender;
    }


    public void setFaculty (String facultyStudent) {
        this.faculty = facultyStudent;
    }

    public String getFaculty () {
        return this.faculty;
    }


    public void setAverageMark (int averageMarkStudent) {
        this.averageMark = averageMarkStudent;
    }

    public double getAverageMark () {
        return this.averageMark;
    }


    public void setFavouriteSubject (String favouriteSubjectStudent) {
        this.favouriteSubject = favouriteSubjectStudent;
    }

    public String getFavouriteSubject () {
        return this.favouriteSubject;
    }


    public void setCourse (int courseStudent) {
        this.course = courseStudent;
    }

    public int getCourse () {
        return this.course;
    }


    public void setColorEyes (String colorEyesStudent) {
        this.colorEyes = colorEyesStudent;
    }

    public String getColorEyes () {
        return this.colorEyes;
    }

    public static void findStudentByGender(List <Student> studentList, int genderStudent) {
        if (genderStudent == 1) {
            Optional <Student> java = studentList.stream()
                    .filter(i -> i.gender.equals("male"))
                    .findAny();
            System.out.println(java);;
        }
        if (genderStudent == 2) {
            Optional <Student> java = studentList.stream()
                    .filter(i -> i.gender.equals("female"))
                    .findAny();

            System.out.println(java);
        }

    }

    public static void findStudentByAverageMark(List <Student> studentList, double averageMarkStudent) {
        Optional <Student> java = studentList.stream()
                .filter(i -> i.getAverageMark() == averageMarkStudent)
                .findAny();
       System.out.println(java);
    }

    public static void findStudentByFaculty(List <Student> studentList, String facultyStudent) {
        List <Student> java = studentList.stream()
                .filter(i -> i.getFaculty().equals(facultyStudent))
                .collect(Collectors.toList());
        System.out.println(java);
    }

    public static void findStudentByFavouriteSubject(List <Student> studentList, String favouriteSubjectStudent) {
        List <Student> java = studentList.stream()
                .filter(i -> i.getFavouriteSubject().equals(favouriteSubjectStudent))
                .collect(Collectors.toList());
        System.out.println(java);
    }

    public static void findStudentByCourse(List <Student> studentList, int courseStudent) {
        List <Student> java = studentList.stream()
                .filter(i -> i.getCourse() == courseStudent)
                .collect(Collectors.toList());
        System.out.println(java);
    }

    public static void findStudentByColorOfEyes(List <Student> studentList, String colorOfEyesStudent) {
        List <Student> java = studentList.stream()
                .filter(i -> i.getColorEyes().equals(colorOfEyesStudent))
                .collect(Collectors.toList());
        System.out.println(java);
    }




}
