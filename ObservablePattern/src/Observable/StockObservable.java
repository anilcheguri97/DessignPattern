package Observable;

import Observer.NotificationAlert;

public interface StockObservable {
    public void add(NotificationAlert notificationAlert);
    public void remove(NotificationAlert notificationAlert);
    public void notifyme();
    public void setStock(int stock);
    public int getStock();

}
