package java_discussion10;

import java.util.Date;


class Student {
    int id;
    String name;
    String program;

    Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    void displayStudent() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
    }
}


class Instructor {
    int id;
    String name;
    String department;
    String title;

    Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    void displayInstructor() {
        System.out.println("Instructor ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Title: " + title);
    }
}


class Course {
    int id;
    String syllabus;
    String title;
    String credits;
    String prerequisite;

    Course(int id, String syllabus, String title,
           String credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    void displayCourse() {
        System.out.println("Course ID: " + id);
        System.out.println("Syllabus: " + syllabus);
        System.out.println("Title: " + title);
        System.out.println("Credits: " + credits);
        System.out.println("Prerequisite: " + prerequisite);
    }
}


class CourseOffering {
    Student student;
    Instructor instructor;
    Course course;
    Date time;
    int sectionNo;
    int roomId;
    int year;
    String semester;

    CourseOffering(Student student, Instructor instructor, Course course,
                   Date time, int sectionNo, int roomId,
                   int year, String semester) {

        this.student = student;
        this.instructor = instructor;
        this.course = course;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    void displayOffering() {
        System.out.println("\n----- Course Offering -----");

        student.displayStudent();
        System.out.println();

        instructor.displayInstructor();
        System.out.println();

        course.displayCourse();
        System.out.println();

        System.out.println("Time: " + time);
        System.out.println("Section No: " + sectionNo);
        System.out.println("Room ID: " + roomId);
        System.out.println("Year: " + year);
        System.out.println("Semester: " + semester);
    }
}


public class program {
    public static void main(String[] args) {

  
        Student s1 = new Student(101, "Rahim", "CSE");

        Instructor i1 = new Instructor(
                201,
                "Dr. Khan",
                "Computer Science",
                "Professor");

        Course c1 = new Course(
                301,
                "Java OOP",
                "Object Oriented Programming",
                "3",
                "Programming Basics");

        CourseOffering co1 = new CourseOffering(
                s1,
                i1,
                c1,
                new Date(),
                1,
                204,
                2026,
                "SP");

      
        co1.displayOffering();
    }
}
