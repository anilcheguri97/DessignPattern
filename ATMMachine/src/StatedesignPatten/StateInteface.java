package StatedesignPatten;

import model.Atm;

public interface StateInteface {
    public void insertCard(Atm atm);
    public  void readCard(Atm atm);
public  void balaceEnquiry(Atm atm);
public  void withDraw(Atm atm);
public  void deposit(Atm atm);
public default void options(Atm atm){

}
public default void exit(Atm atm) {

}
}
