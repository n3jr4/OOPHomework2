package org.nejrasm.zadaca2oop.lecturetask;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final List<Students> listOfStudents;

    public Classroom() {
        this.listOfStudents = new ArrayList<Students>();
    }

    public void addStudent(final Students student) {
        this.listOfStudents.add(student);
    }

    public boolean isPresent(final String studentName) {
        for (Students student : listOfStudents) {
            if (student.getNameOfStudent().equals(studentName)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        System.out.println(listOfStudents.toString());
    }
}
