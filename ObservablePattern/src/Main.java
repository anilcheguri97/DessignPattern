import Observable.IphoneStockObserver;
import Observable.StockObservable;
import Observer.EmailNotificationAllert;
import Observer.NotificationAlert;
import Observer.PhoneNotificationAlert;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StockObservable iphone = new IphoneStockObserver();

        NotificationAlert observer1 = new EmailNotificationAllert("anil@gmail.com",iphone);
        NotificationAlert observer2 = new EmailNotificationAllert("anil@gmail.com",iphone);
        NotificationAlert observer3 = new EmailNotificationAllert("anil@gmail.com",iphone);
        NotificationAlert observer4 = new PhoneNotificationAlert("9492806139",iphone);


        iphone.add(observer1);
        iphone.add(observer2);
        iphone.add(observer3);
        iphone.add(observer4);

        iphone.setStock(10);

        iphone.setStock(1);
        iphone.setStock(0);






    }
}