package org.nejrasm.zadaca2oop.lecturetask;

public class Students {
    private final String nameOfStudent;
    private final int ageOfStudent;

    public Students(final String nameOfStudent) {
        this(nameOfStudent, 15);
    }

    public Students(final String nameOfStudent, final int ageOfStudent) {
        this.nameOfStudent = nameOfStudent;
        this.ageOfStudent = ageOfStudent;
    }

    public int getAgeOfStudent() {
        return this.ageOfStudent;
    }

    public String getNameOfStudent() {
        return this.nameOfStudent;
    }

    @Override
    public String toString() {
        return (this.nameOfStudent + " " + this.ageOfStudent);
    }
}
