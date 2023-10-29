import college.College;
import student.Student;
import teacher.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of Student, Teacher, and College class
        System.out.printf("Please enter student name:%n ");
        String studentName = scanner.nextLine();

        System.out.printf("Please enter student ID:%n ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Please enter number of grades: %n");
        int Grades = scanner.nextInt();
        scanner.nextLine();

        int[] grades = new int[Grades];
        for (int i = 0; i < Grades; i++) {
            System.out.printf("Please enter grade " + (i + 1) + ": %n");
            grades[i] = scanner.nextInt();
            scanner.nextLine();
        }

        Student student1 = new Student(studentName, studentId, grades);

        System.out.printf("Please enter student name: %n");
        String studentName2 = scanner.nextLine();

        System.out.printf("Please enter student ID:%n ");
        int studentId2 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.printf("Please enter number of grades:%n ");
        int numGrades2 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        int[] grades2 = new int[numGrades2];
        for (int i = 0; i < numGrades2; i++) {
            System.out.printf("Please enter grade " + (i + 1) + ":%n ");
            grades2[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }

        Student student2 = new Student(studentName2, studentId2, grades2);

        System.out.printf("Please enter teacher name: %n");
        String teacherName = scanner.nextLine();

        System.out.printf("Please enter subject: %n");
        String subject = scanner.nextLine();

        Teacher teacher1 = new Teacher(teacherName, subject);

        College college = new College("CCI", new ArrayList<>(), new ArrayList<>());

        college.addStudent(student1);
        college.addStudent(student2);
        college.addTeacher(teacher1);

        college.displayStudents();
        college.displayTeachers();

        scanner.close();
    }
}