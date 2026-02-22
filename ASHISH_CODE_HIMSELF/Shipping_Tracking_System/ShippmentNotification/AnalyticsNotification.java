package ASHISH_CODE_HIMSELF.Shipping_Tracking_System.ShippmentNotification;

import ASHISH_CODE_HIMSELF.Shipping_Tracking_System.Enum.ShippingStatus;

public class AnalyticsNotification implements ShippmentObserver {
    @Override
    public void onchange(String eventId, ShippingStatus status)
    {
        System.out.println("For this shipping id= "+eventId+" status has been changed= "+ status.getStatus);
        
    }
}
