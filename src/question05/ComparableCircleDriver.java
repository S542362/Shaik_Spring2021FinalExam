/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author Shabnam Shaik
 */
public class ComparableCircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComparableCircle circle1 = new ComparableCircle(26.5);

        ComparableCircle circle2 = new ComparableCircle(13.4);

        System.out.println("Larger instance: " + findLargest(circle1, circle2));
    }

    private static String findLargest(ComparableCircle circle1, ComparableCircle circle2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sha = " ";
        System.out.println("Shabnam Shaik");
        if (circle1.compareTo(circle2) > 0) {
            sha = "The area of ​​the first circle is large.";
        } else if (circle1.compareTo(circle2) < 0) {
            sha = "The area of ​​the second circle is large.";
        } else {
            sha = "The area of ​​the two circles is the same";
        }

        return sha;
    }
}
