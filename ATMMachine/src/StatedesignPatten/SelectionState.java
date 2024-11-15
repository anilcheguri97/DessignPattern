package StatedesignPatten;

import model.Atm;

import java.util.Scanner;

public class SelectionState implements StateInteface{
    @Override
    public void insertCard(Atm atm) {

    }

    @Override
    public void readCard(Atm atm) {

    }

    @Override
    public void balaceEnquiry(Atm atm) {



    }

    @Override
    public void withDraw(Atm atm) {
        System.out.println("withdrwaing money");
        exit(atm);
    }

    @Override
    public void exit(Atm atm) {
     atm.setStateInteface(new IdleState());
    }

    public void options(Atm atm) {
        Scanner sc =new  Scanner(System.in);
        System.out.println("please Select any one option below");
        System.out.println("1 withdraw");
        System.out.println("2 balanceEnquiry");
        System.out.println("3 deposit");
        System.out.println("4 exit");

        int i = sc.nextInt();
        switch (i){
            case 1:
                withDraw(atm);
                break;
            case 2:
                balaceEnquiry(atm);
                break;
            case 3:
                deposit(atm);
                break;
            default:
                break;

        }

    }

    @Override
    public void deposit(Atm atm) {

    }
}
