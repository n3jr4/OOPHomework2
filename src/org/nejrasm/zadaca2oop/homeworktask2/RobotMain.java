package org.nejrasm.zadaca2oop.homeworktask2;

public class RobotMain {
    public static void main(String[] args) {
        final Robot robot = new Robot(1, 1);

        robot.moveEast();
        robot.moveEast();
        robot.moveNorth();
        robot.moveWest();

        robot.printLastPosition(3);
        System.out.println(robot.getDistance());
        robot.printLastPosition(robot.getMoves());

    }
}