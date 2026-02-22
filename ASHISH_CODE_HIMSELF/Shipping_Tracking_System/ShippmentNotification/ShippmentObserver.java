package ASHISH_CODE_HIMSELF.Shipping_Tracking_System.ShippmentNotification;

import ASHISH_CODE_HIMSELF.Observer_Pattern_Practise.ShippingEvents;
import ASHISH_CODE_HIMSELF.Shipping_Tracking_System.Enum.ShippingStatus;

public interface ShippmentObserver {
    public void onchange(String eventId, ShippingStatus status);
}
