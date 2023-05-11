public class CarRobot extends Robot
{

    public CarRobot(){}

    public CarRobot(char direction, int x, int y) {
        super("Car", direction, x, y);
    }
    public double calculateSeconds(int x, int y) {
        return Math.sqrt(Math.pow((getXLocation() - x), 2) + Math.pow((getYLocation() - y), 2));
    }

}