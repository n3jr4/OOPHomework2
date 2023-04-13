package org.nejrasm.zadaca2oop.homeworktask2;

public class Moves {
    private int currentXPosition;
    private int currentYPosition;

    public Moves() {
        this(0, 0);
    }

    public Moves(final int currentXPosition, final int currentYPosition) {
        this.currentXPosition = currentXPosition;
        this.currentYPosition = currentYPosition;
    }

    public int getCurrentXPosition() {
        return this.currentXPosition;
    }

    public int getCurrentYPosition() {
        return currentYPosition;
    }

    public void setCurrentXPosition(int currentXPosition) {
        this.currentXPosition = currentXPosition;
    }

    public void setCurrentYPosition(int currentYPosition) {
        this.currentYPosition = currentYPosition;
    }

    @Override
    public String toString() {
        return (this.currentXPosition + "," + this.currentYPosition);
    }

}
