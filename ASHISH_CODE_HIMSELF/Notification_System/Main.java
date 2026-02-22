package ASHISH_CODE_HIMSELF.Notification_System;

import ASHISH_CODE_HIMSELF.Notification_System.Enum.EventType;
import PRACTISE.Car_Rental_System.core.User;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.addTemplate(order placem ,"geerice message");
        User Ashish = new User("u1", "Ashis", "ksdmfk");
        service.notifiy(EventType.ORDER_PLACED, Ashish, new HashMap<>(Map.of("Orders")));
    }
}
