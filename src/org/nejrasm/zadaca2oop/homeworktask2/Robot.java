package org.nejrasm.zadaca2oop.homeworktask2;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    final private int initialXPosition;
    final private int initialYPosition;
    private int currentXPosition;
    private int currentYPosition;
    private int movesCounter = 0;
    private List<String> movesHistory = new ArrayList<>();

    public Robot() {
        this(0, 0);
    }

    public Robot(final int initialXPosition, final int initialYPosition) {
        this.initialXPosition = initialXPosition;
        this.initialYPosition = initialYPosition;
        this.currentXPosition = initialXPosition;
        this.currentYPosition = initialYPosition;
        movesHistory.add(getPosition());
    }

    public int getInitialXPosition() {
        return this.initialXPosition;
    }

    public int getInitialYPosition() {
        return this.initialYPosition;
    }

    public void moveSouth() {
        this.currentYPosition -= 1;
        movesCounter += 1;
        movesHistory.add(getPosition());
    }

    public void moveNorth() {
        this.currentYPosition += 1;
        movesCounter += 1;
        movesHistory.add(getPosition());
    }

    public void moveEast() {
        this.currentXPosition += 1;
        movesCounter += 1;
        movesHistory.add(getPosition());
    }

    public void moveWest() {
        this.currentXPosition -= 1;
        movesCounter += 1;
        movesHistory.add(getPosition());
    }

    public String getPosition() {
        return ("(" + this.currentXPosition + "," + this.currentYPosition + ")");
    }

    public double getDistance() {
        return Math.sqrt(Math.pow((double) (this.currentXPosition - this.initialXPosition), 2) + Math.pow((double) (this.currentYPosition - this.initialYPosition), 2));
    }

    public int getMoves() {
        return movesCounter;
    }

    public void printLastPosition(int n) {
        int numberOfElements;
        if (n > movesCounter) {
            numberOfElements = 0;
        } else numberOfElements = movesCounter - n;

        for (int i = movesCounter; i > numberOfElements; i--) {
            System.out.println(movesHistory.get(i));
        }
    }

}
