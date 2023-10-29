package college;
import student.Student;
import teacher.Teacher;
import java.util.ArrayList;
import java.util.Arrays;

public class College {
    //defining an attributes of this class
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    //generating  constructor
    public College(String name, ArrayList<Student> students, ArrayList<Teacher> teachers) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }
    //generating gitter
    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    //generating a setter
    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
    //adding an objects of Student and Teacher class to the college class
    public void addStudent(Student student1) {
        students.add(student1);
    }

    public void addTeacher(Teacher teacher1) {
        teachers.add(teacher1);
    }
    //displaying the objects of Student and Teacher class along with the college name
    public void displayStudents() {
        System.out.println("Students of " + name + " College:");
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName() + ", grades: " +  Arrays.toString(student.getGrades()));
        }
    }
    public void displayTeachers() {
        System.out.println("Teachers of " + name + " College:");
        for (Teacher teacher : teachers) {
            System.out.println("Name: " + teacher.getName() + ", subject: " + teacher.getSubject() );
        }
    }
}