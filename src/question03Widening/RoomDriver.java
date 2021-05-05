/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03Widening;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class RoomDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int RoomLength = 74;
        long perimeter = RoomLength;
        double RoomBreadth = perimeter;

        Room r = new Room(RoomLength, RoomBreadth, perimeter);
        System.out.println("Shabnam Shaik");
        System.out.println(r.toString());
    }

}
