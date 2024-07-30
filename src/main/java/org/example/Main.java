package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Yatak Odası", new Wall("Sağ"), new Wall("Sol"), new Wall("Ön"), new Wall("Arka"), new Ceiling(20, PaintColor.WHITE), new Bed("Üç Kişilik", 5, 5 ,5 ,5),new Lamp(LampType.LAVA, true, 95),new Wardrobe(2 , 3, 50), new Carpet(2 , 3, PaintColor.GREEN));
        System.out.println(bedroom);
        System.out.println("----------------------------");
    }
}