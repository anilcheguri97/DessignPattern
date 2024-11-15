package model;

import StatedesignPatten.IdleState;
import StatedesignPatten.StateInteface;

public class Atm {
    // singleton object
    public static Atm atmObject = new Atm();
    StateInteface stateInteface;

    public StateInteface getStateInteface() {
        return stateInteface;
    }

    private  Atm(){

    }

    public void setStateInteface(StateInteface stateInteface) {
        this.stateInteface = stateInteface;
    }
    private int atmBalance;
    int noOfTwoHousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    public int getNoOfTwoHousandNotes() {
        return noOfTwoHousandNotes;
    }

    public void setNoOfTwoHousandNotes(int noOfTwoHousandNotes) {
        this.noOfTwoHousandNotes = noOfTwoHousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public void setNoOfFiveHundredNotes(int noOfFiveHundredNotes) {
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void setNoOfOneHundredNotes(int noOfOneHundredNotes) {
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public static Atm getAtmObject() {
        atmObject.setStateInteface(new IdleState());
        return atmObject;
    }

    public void setAmountBalance(int atmBalance,int noOfTwoHousandNotes,int noOfFiveHundredNotes,int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoHousandNotes = noOfTwoHousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }
}
