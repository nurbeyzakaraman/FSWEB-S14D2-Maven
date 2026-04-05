package org.example;

import org.example.model.*;
import org.example.model.enums.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    Wall northWall = new Wall("North");
    Wall southWall = new Wall("South");
    Wall eastWall = new Wall("East");
    Wall westWall = new Wall("West");

    Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
    Bed bed = new Bed("Modern", 2, 50, 1, 1);
    Lamp lamp = new Lamp(LampType.NEON, true, 5);
    Wardrobe wardrobe = new Wardrobe(100, 200, 50.5);
    Carpet carpet = new Carpet(200, 300, PaintColor.GREEN);

    Bedroom myBedroom = new Bedroom(
            "Nurbeyza's Room",
            northWall, southWall, eastWall, westWall,
            ceiling, bed, lamp, wardrobe, carpet
    );
}