/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10_example2;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int list[] = new int[]{101, 78, 54, 67, 89};
        System.out.println("Shabnam Shaik");
        System.out.print("Enter the value: ");
        int value = scan.nextInt();
        int h = recursiveSearch(list, 0, list.length - 1, value);
        if (h != -1) {
            System.out.println("value is present"
            );
        } else {
            System.out.println("value is not present");
        }
    }

    private static int recursiveSearch(int[] list, int s, int t, int r) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (t < s) {
            return -1;
        }
        if (list[s] == r) {
            return s;
        }
        if (list[t] == r) {
            return t;
        }
        return recursiveSearch(list, s + 1, t - 1, r);
    }
}
