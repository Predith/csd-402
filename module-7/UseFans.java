// Kristopher Kuenning
// 06/28/2025
// CSD 402
// Module 7

import java.util.*;

  //Collection of Fan instances
public class UseFans {

    public static void main(String[] args) {

        //Build a collection of Fan instances
        List<Fan> fans = new ArrayList<>();

        Fan defaultFan = new Fan();                            // default values
        Fan kitchenFan = new Fan(Fan.MEDIUM, true,  9.0, "silver");
        Fan patioFan   = new Fan(Fan.FAST,   true, 12.0, "black");
        Fan bedroomFan = new Fan(Fan.SLOW,   false, 8.0, "blue");

        Collections.addAll(fans, defaultFan, kitchenFan, patioFan, bedroomFan);

        //Display collection
        displayFans(fans);

        System.out.println("\nSingle‑fan display");
        displayFan(kitchenFan);
    }

    //Displaying collection of Fan instances without relying on Fan.toString()
    public static void displayFans(Collection<Fan> fans) {
        System.out.println("Fan Collection");
        for (Fan f : fans) {
            displayFan(f);
        }
    }

    //Displaying one Fan instance without using Fan.toString()
    public static void displayFan(Fan fan) {
        String status    = fan.isOn() ? "ON" : "OFF";
        String speedText = fan.isOn() ? speedToString(fan.getSpeed()) : "N/A";

        System.out.printf("Status: %-3s | Speed: %-6s | Radius: %.1f | Color: %s%n",
                status, speedText, fan.getRadius(), fan.getColor());
    }

    // Helper method mirrors Fan.speedToString
    private static String speedToString(int speed) {
        switch (speed) {
            case Fan.SLOW:   return "SLOW";
            case Fan.MEDIUM: return "MEDIUM";
            case Fan.FAST:   return "FAST";
            default:         return "STOPPED";
        }
    }
}