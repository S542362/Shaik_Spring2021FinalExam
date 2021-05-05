/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06_checked;

/**
 *
 * @author Shabnam Shaik
 */
public class Train {

    private int numberOfCompartments;
    private String trainName;

    public Train(int numberOfCompartments, String trainName) {
        this.numberOfCompartments = numberOfCompartments;
        this.trainName = trainName;
    }

    public int getNumberOfCompartments() {
        return numberOfCompartments;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setNumberOfCompartments(int numberOfCompartments) {
        this.numberOfCompartments = numberOfCompartments;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    @Override
    public String toString() {
        return " numberOfCompartments:  " + numberOfCompartments + "\ntrainName: " + trainName;
    }

}
