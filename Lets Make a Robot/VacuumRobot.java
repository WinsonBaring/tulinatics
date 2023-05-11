package Lets Make a Robot;

public public class VacuumRobot extends Robot {
    private int totalUnitsCleaned;
    private int ctr;
    VacuumRobot(char direction, int x, int y) {
        super("Vacuum", direction, x, y);
        totalUnitsCleaned = 0;
        ctr = 0;

    }
    public int getTotalUnitsCleaned() {
        return totalUnitsCleaned;
    }

    public void setTotalUnitsCleaned(int totalUnitsCleaned) {
        this.totalUnitsCleaned = totalUnitsCleaned;
    }

    // N E W S
    @Override
    public void move(int steps) {
        super.move(steps);
        if(ctr == 4) return;
        ctr++;
        totalUnitsCleaned+=steps;
    }
    
    @Override
    public String toString() {
        return super.toString() + " It has cleaned " + totalUnitsCleaned + " units so far.";
    }
} {
    
}
