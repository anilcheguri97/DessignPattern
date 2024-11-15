package Observer;

import Observable.StockObservable;

public class PhoneNotificationAlert implements NotificationAlert{
    StockObservable stockObservable;
    String phone ;
    public PhoneNotificationAlert(String phone, StockObservable stockObservable){
        this.phone= phone;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        sendMsg();
    }

    public void sendMsg() {
        System.out.println(" alert send to cleint vail phone"+phone);
    }
}
