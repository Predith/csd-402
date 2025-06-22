// Kristopher Kuenning
// 06/22/2025
// CSD 402
// Module 6

//Write a program with a class titled Fan.
public class Fan {

    // Four constants named STOPPED, SLOW, MEDIUM, and FAST. Constants hold values of 0,1,2, and 3.
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    //A private field named speed that holds one of the constant values with the default being STOPPED
    private int speed;

    //A private Boolean field titled on that specifies whether the fan is on or off.
    private boolean on;

    //A private field named radius that holds the radius of the fan with a default value of 6.
    private double radius;

    //A string field that holds the color, with a default value
    private String color;

    //A constructor takes arguments and sets values.
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    //A no-argument constructor that sets all fields with a default value
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters methods for all mutable fields
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setters methods for all mutable fields
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Write a toString() method that returns a description of the Fans state
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON - Speed: " + speedToString(speed) +
                    ", Radius: " + radius + ", Color: " + color;
        } else {
            return "Fan is OFF - Radius: " + radius + ", Color: " + color;
        }
    }

    private String speedToString(int speed) {
        switch (speed) {
            case SLOW: return "SLOW";
            case MEDIUM: return "MEDIUM";
            case FAST: return "FAST";
            default: return "STOPPED";
        }
    }
}