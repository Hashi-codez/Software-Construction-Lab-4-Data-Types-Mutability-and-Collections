/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
import java.util.HashMap;
import java.util.Map;

public class TreasureMap {

    public static void main(String[] args) {
        Map<String, Double> treasures = new HashMap<>();
        treasures.put("beach", 25.0);
        treasures.put("palm", 50.0);
        treasures.put("cove", 75.0);

        System.out.println("Original map: " + treasures);

        // Task: update "palm" to be its current value + size of the map
        int mapSize = treasures.size(); // 3 at this point
        double currentPalmValue = treasures.get("palm");
        treasures.put("palm", currentPalmValue + mapSize);

        System.out.println("Map after updating 'palm': " + treasures);

        // Task: sum all values using a for-each loop over treasures.values()
        double total = 0.0;
        for (double value : treasures.values()) {
            total += value;
        }

        System.out.println("Total sum of all treasure values: " + total);
    }
}
