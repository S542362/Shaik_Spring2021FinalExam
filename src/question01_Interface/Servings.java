/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01_Interface;

/**
 *
 * @author Shabnam Shaik
 */
public interface Servings {

    default double String(String sh) {
        int str = sh.indexOf("b");
        return str;
    }

    /**
     *
     * @return
     */
    String servesperhead();
}
