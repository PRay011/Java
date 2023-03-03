package 第二题;

import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());
        System.out.println();

        course1.dropStudent("Peter Jones");
        System.out.println("Number of else students in course1: "
                + course1.getNumberOfStudents());
        String[] students1 = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students1[i] + ", ");

    }
}

class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String[] getStudents() {
        String[] stu = new String[students.size()];
        students.toArray(stu);
        return stu;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
        numberOfStudents--;
//        for (int i = 0; i < numberOfStudents; i++) {
//            if (students[i] != student) {
//                continue;
//            } else {
//                for (int j = i; j < numberOfStudents - 1; j++) {
//                    students[j] = students[j + 1];
//                }
//                numberOfStudents--;
//                break;
//            }
//        }
    }
}