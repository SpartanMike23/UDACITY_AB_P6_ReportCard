package com.example.android.reportcardjavaclass;

import java.util.ArrayList;

/**
 * Created by Michael on 8/25/16.
 */
public class reportCard {

    public static void main(String[] args) {

        //ArrayList created to store student data, using contructor studentReportCard
        ArrayList<studentReportCard> StudentReportCards = new ArrayList<studentReportCard>();
        StudentReportCards.add(new studentReportCard("Michael", "N", "B+", 88.88, "Geometry"));
        StudentReportCards.add(new studentReportCard("Miguel", "N", "B+", 88.67, "History"));


        //Testing setters
        StudentReportCards.get(1).setFirstName("Michael");
        StudentReportCards.get(0).setLastName("Renegade");
        StudentReportCards.get(0).setPercentage(88.99);
        StudentReportCards.get(0).setGrade("B+");
        StudentReportCards.get(0).setSubject("Biology");
        StudentReportCards.get(1).setSubject("History");
        //Testing Getters
        StudentReportCards.get(1).getGrade();
        StudentReportCards.get(0).getGrade();
        StudentReportCards.get(1).getPercentage();
        StudentReportCards.get(0).getSubject();
        //Testing toString
        StudentReportCards.get(1).toString();
        StudentReportCards.get(0).toString();
        //implementing constants

    }

}


class studentReportCard {
    final static String School = "Skyline HighSchool";
    String firstName;//First
    String lastName;
    String grade; // Letter scale from A, B, C, D, F
    Double percentage; // percentage of the corresponding grade
    final static int year = 2010;
    String subject;


    //Constructor
    public studentReportCard(String firstName, String lastName, String grade, double percentage, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.percentage = percentage;
        this.subject = subject;
    }


//setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(String grade) {

        //ArrayList created for grading scale
        ArrayList<String> gradeScale = new ArrayList<String>();
        gradeScale.add("A+");
        gradeScale.add("A");
        gradeScale.add("A-");
        gradeScale.add("B+");
        gradeScale.add("B-");
        gradeScale.add("B");
        gradeScale.add("C+");
        gradeScale.add("C-");
        gradeScale.add("C");
        gradeScale.add("D+");
        gradeScale.add("D-");
        gradeScale.add("D");
        gradeScale.add("F");

        //for loop to determine if received parameter is valid with gradingScale
        for (int i = 0; gradeScale.size() > i; i++) {
            if (grade.equals(gradeScale.get(i))) {
                this.grade = grade;
                return;
            } else {
                System.out.println(R.string.wrongGrade);
                return;
            }

        }


    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGrade() {
        return grade;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getYear() {
        return year;
    }

    public String getSubject() {
        return subject;
    }

    //prints summary of report card

    //to String method
    @Override
    public String toString() {
        return "studentReportCard{" +
                "name='" + firstName + lastName + '\'' +
                ", grade='" + grade + '\'' +
                ", percentage=" + percentage +
                ", year=" + year +
                ", subject='" + subject + '\'' +
                '}';
    }


}
