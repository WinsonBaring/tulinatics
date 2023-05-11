public class Robot {
    private String name;
    private char direction;
    private int xLocation, yLocation;

    public Robot() {}

    public Robot(String name, char direction, int xLocation, int yLocation) {
        setName(name);
        setDirection(direction);
        setXLocation(xLocation);
        setYLocation(yLocation);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public int getXLocation() {
        return xLocation;
    }

    public void setXLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public int getYLocation() {
        return yLocation;
    }

    public void setYLocation(int yLocation) {
        this.yLocation = yLocation;
    }

    public void turnClockwise() {
        switch (getDirection()) {
            case 'E':
                setDirection('S');
                break;
            case 'N':
                setDirection('E');
                break;
            case 'W':
                setDirection('N');
                break;
            case 'S':
                setDirection('W');
                break;

        }
    }

    public void turnCounterclockwise() {
        switch (getDirection()) {
            case 'N':
                setDirection('W');
                break;
            case 'E':
                setDirection('N');
                break;
            case 'W':
                setDirection('S');
                break;
            case 'S':
                setDirection('E');
                break;
        }
    }

    public void move(int steps) {
        if(getDirection() == 'N') {
            setXLocation(getXLocation() + steps);
            setYLocation(getYLocation() + steps);
        }
        else if(getDirection() == 'E') {
            setYLocation(getYLocation() - steps);
        } else if(getDirection() == 'S') {
            setXLocation(getXLocation() - steps);
        } else if(getDirection() == 'W') {
            setYLocation(getYLocation() - steps);
        }
    }

    public String toString() {
        return getName() + " faces " + getDirection() + " and is located at coordinates (" + getXLocation() + ", " + getYLocation() + ").";
    }
}