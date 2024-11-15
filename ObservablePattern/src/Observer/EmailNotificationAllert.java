package Observer;

import Observable.StockObservable;

public class EmailNotificationAllert implements NotificationAlert{
    StockObservable stockObservable;
    String email ;
    public EmailNotificationAllert(String email,StockObservable stockObservable){
        this.email= email;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        sendMsg();
    }

    public void sendMsg() {
        System.out.println(" alert send to cleint vail email"+email);
    }
}
