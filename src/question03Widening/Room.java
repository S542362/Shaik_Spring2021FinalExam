/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03Widening;

/**
 *
 * @author Shabnam Shaik
 */
public class Room {

    private int RoomLength;
    private double RoomBreadth;
    private long perimeter;

    public Room(int RoomLength, double RoomBreadth, long perimeter) {
        this.RoomLength = RoomLength;
        this.RoomBreadth = RoomBreadth;
        this.perimeter = perimeter;
    }

    public int getRoomLength() {
        return RoomLength;
    }

    public void setRoomLength(int RoomLength) {
        this.RoomLength = RoomLength;
    }

    public double getRoomBreadth() {
        return RoomBreadth;
    }

    public void setRoomBreadth(double RoomBreadth) {
        this.RoomBreadth = RoomBreadth;
    }

    public long getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(long perimeter) {
        this.perimeter = perimeter;
    }

    public double getarea() {

        double area = RoomLength * RoomBreadth;
        return area;
    }

    @Override
    public String toString() {
        return "Length of the room is: " + RoomLength + "\n" + "Breadth of the room is: " + RoomBreadth + "\nPerimeter: " + perimeter
                + "\narea is: " + getarea();
    }

}
