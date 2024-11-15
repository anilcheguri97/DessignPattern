package StatedesignPatten;

import model.Atm;

public class HasCardState implements StateInteface{

    @Override
    public void insertCard(Atm atm) {

    }

    @Override
    public void readCard(Atm atm) {
        System.out.println("card is reading");
        atm.setStateInteface(new SelectionState());
    }

    @Override
    public void balaceEnquiry(Atm atm) {

    }

    @Override
    public void withDraw(Atm atm) {

    }

    @Override
    public void deposit(Atm atm) {

    }
}
