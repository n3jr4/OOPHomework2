package org.nejrasm.zadaca2oop.homeworktask2;

import org.nejrasm.zadaca2oop.lecturetask.Students;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private final int initialXPosition;
    private final int initialYPosition;
    private int movesCounter = 0;
    private final List<Moves> movesHistory;
    private final Moves move;

    public Robot() {
        this(0, 0);
    }

    public Robot(final int initialXPosition, final int initialYPosition) {
        this.initialXPosition = initialXPosition;
        this.initialYPosition = initialYPosition;
        this.movesHistory = new ArrayList<Moves>();
        this.move = new Moves(this.initialXPosition, this.initialYPosition);
        addMoves(move);
        movesCounter += 1;
    }

    public int getInitialXPosition() {
        return this.initialXPosition;
    }

    public int getInitialYPosition() {
        return this.initialYPosition;
    }

    public void moveSouth() {
        this.move.setCurrentYPosition(this.move.getCurrentYPosition() - 1);
        addMoves(move);
        movesCounter += 1;
    }

    public void moveNorth() {
        this.move.setCurrentYPosition(this.move.getCurrentYPosition() + 1);
        addMoves(move);
        movesCounter += 1;
    }

    public void moveEast() {
        this.move.setCurrentXPosition(this.move.getCurrentXPosition() + 1);
        addMoves(move);
        movesCounter += 1;
    }

    public void moveWest() {
        this.move.setCurrentXPosition(this.move.getCurrentXPosition() - 1);
        addMoves(move);
        movesCounter += 1;
    }

    public Moves getPosition() {
        return this.move;
    }

    public double getDistance() {
        return Math.sqrt(Math.pow((double) (this.move.getCurrentXPosition() - this.initialXPosition), 2) + Math.pow((double) (this.move.getCurrentXPosition() - this.initialYPosition), 2));
    }

    public int getMoves() {
        return movesCounter;
    }

    public void addMoves(final Moves move) {
        Moves currentMove = new Moves(this.move.getCurrentXPosition(), this.move.getCurrentYPosition());
        this.movesHistory.add(currentMove);
    }

    public void printLastPosition(int n) {
        int limit = 0;
        if (n < movesCounter) {
            limit = movesCounter - n;
        }
        for (int i = movesHistory.size() - 1; i > limit - 1; i--) {
            System.out.println(movesHistory.get(i).toString());
        }
    }

}
