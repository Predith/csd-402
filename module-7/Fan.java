// Kristopher Kuenning
// 06/28/2025
// CSD 402
// Module 7

public class Fan {

    // Speed constants
    public static final int STOPPED = 0;
    public static final int SLOW    = 1;
    public static final int MEDIUM  = 2;
    public static final int FAST    = 3;

    // Fields
    private int     speed  = STOPPED;
    private boolean on     = false;
    private double  radius = 6.0;
    private String  color  = "white";


    public Fan() {}

    //A no-argument constructor that sets all fields with a default value
    public Fan(int speed, boolean on, double radius, String color) {
        this.setSpeed(speed);
        this.setOn(on);
        this.setRadius(radius);
        this.setColor(color);
    }

    // --- Getters ---
    public int getSpeed()       { return this.speed;  }
    public boolean isOn()       { return this.on;     }
    public double getRadius()   { return this.radius; }
    public String getColor()    { return this.color;  }

    // --- Setters ---
    public void setSpeed(int speed)     { this.speed  = speed;  }
    public void setOn(boolean on)       { this.on     = on;     }
    public void setRadius(double radius){ this.radius = radius; }
    public void setColor(String color)  { this.color  = color;  }

    // --- Utility ---
    @Override
    public String toString() {
        return this.on
             ? "Fan is ON  - Speed: " + this.speedToString(this.speed)
               + ", Radius: " + this.radius + ", Color: " + this.color
             : "Fan is OFF - Radius: " + this.radius + ", Color: " + this.color;
    }

    private String speedToString(int s) {
        switch (s) {
            case SLOW:   return "SLOW";
            case MEDIUM: return "MEDIUM";
            case FAST:   return "FAST";
            default:     return "STOPPED";
        }
    }
}