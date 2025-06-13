package fils;

import base.Person;

public class Teacher extends Person {
    private String courseName;
    private int yearsOfExperience;

    // Constructor
    public Teacher(String name, int age,  String courseName, int yearsOfExperience) {
        super(name , age);
        this.courseName = courseName;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void displayInfoTeacher() {
        System.out.println("Course Name: " + courseName + ", Years of Experience: " + yearsOfExperience);
    }
}
