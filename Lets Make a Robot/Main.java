package Lets Make a Robot;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // Hey there, start typing your Java code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Robot type (1 - Vacuum, 2 - Car): ");
        int robot_type = input.nextInt();

        if(robot_type == 1) {

            System.out.print("Enter position x: ");
            int x = input.nextInt();


            System.out.print("Enter position y: ");
            int y = input.nextInt();

            System.out.print("Enter inital direction (N, E, W, S): ");
            char direction = input.next().charAt(0);

            VacuumRobot someRobot = new VacuumRobot(direction, x, y);

            someRobot.toString();
            Tester.test(someRobot);
        } else {
            System.out.print("Enter position x: ");
            int x = input.nextInt();

            System.out.print("Enter position y: ");
            int y = input.nextInt();

            System.out.print("Enter inital direction (N, E, W, S): ");
            char direction = input.next().charAt(0);

            CarRobot someRobot = new CarRobot(direction, x, y);

            Tester.test(someRobot);
        }
    }
}
