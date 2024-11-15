package StatedesignPatten;

import model.Atm;

public class IdleState implements StateInteface{
    @Override
    public void insertCard(Atm atm) {
        atm.setStateInteface(new HasCardState() );
    }

    @Override
    public void readCard(Atm atm) {

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
