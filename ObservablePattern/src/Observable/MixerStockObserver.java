package Observable;

import Observer.NotificationAlert;

import java.util.ArrayList;
import java.util.List;

public class MixerStockObserver implements  StockObservable{
    List<NotificationAlert> notificationAlerts = new ArrayList<>();
    public int stockCount=0;
    @Override
    public void add(NotificationAlert notificationAlert) {
        notificationAlerts.add(notificationAlert);
    }

    @Override
    public void remove(NotificationAlert notificationAlert) {
         notificationAlerts.remove(notificationAlert);
    }

    @Override
    public void notifyme() {
       notificationAlerts.forEach(obj-> obj.update());
    }

    @Override
    public void setStock(int stock) {
          if(stockCount==0){
              notifyme();
          }
          stockCount+=stock;
    }

    @Override
    public int getStock() {
        return stockCount;
    }
}
