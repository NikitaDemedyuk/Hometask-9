package com.company;

public class Student {
    private int yearOfBirth;
    private String name;
    private String gender;
    private String faculty;
    private String favouriteSubject;
    private int course;
    private String colorEyes;

    public Student(int yearOfBirthStudent, String nameStudent, String genderStudent, String facultyStudent, String favouriteSubjectStudent,
                   int courseStudent, String colorEyesStudent) {
        yearOfBirth = yearOfBirthStudent;
        name = nameStudent;
        gender = genderStudent;
        faculty = facultyStudent;
        favouriteSubject = favouriteSubjectStudent;
        course = courseStudent;
        colorEyes = colorEyesStudent;
    }


    @Override
    public String toString() {
        return ("Name: " + this.name + "| Gender: " + this.gender + "| Faculty: " + this.faculty +
                "| Favourite subject: " + this.favouriteSubject + "| Course: " + this.gender + "| Color of eyes: " + this.colorEyes);
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

 }
