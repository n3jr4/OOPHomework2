package org.nejrasm.zadaca2oop.lecturetask;

public class ClassroomMain {
    public static void main(String[] args) {

        final Classroom classroom = new Classroom();

        classroom.addStudent(new Students("Nejra", 30));
        classroom.addStudent(new Students("Haris", 30));
        classroom.addStudent(new Students("Faruk"));
        classroom.addStudent(new Students("Omar", 28));

        classroom.print();

        System.out.println(classroom.isPresent("Nejra"));
    }
}
