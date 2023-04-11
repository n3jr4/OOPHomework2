package org.nejrasm.zadaca2oop.homeworktask2;

public class RobotMain {
    public static void main(String[] args) {
        final Robot robot = new Robot();

        robot.moveEast();
        robot.moveEast();
        robot.moveNorth();
        robot.moveWest();

        System.out.println(robot.getMoves());

        robot.printLastPosition(1);
        robot.printLastPosition(robot.getMoves());

    }
}