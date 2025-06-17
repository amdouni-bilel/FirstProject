package fils;


import base.Person;

public class Student extends Person {
    private String studentId;
    private double averageScore;

    public Student(String name, int age, String studentId, double averageScore) {
        super(name, age);
        this.studentId = studentId;
        this.averageScore = averageScore;
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }


    public void displayInfoStudent() {
        System.out.println("Student ID: " + studentId + ", Average Score: " + averageScore);
    }

//        @Override
//        public void parle(){
//            System.out.println("je parle comme etant une etudiant ");
//        }


}