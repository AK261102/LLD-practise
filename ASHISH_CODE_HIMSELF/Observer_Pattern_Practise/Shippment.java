package ASHISH_CODE_HIMSELF.Observer_Pattern_Practise;

public class Shippment {
    private String shippingID;
    private String currentLocation;
    private DeliveryStatus delivery;

    private int List<ShippingEvents> obs = new ArrayList<>();

    public Shippment(String shippingID)
    {
        this.shippingID=shippingID;
        this.currentLocation="WARE_HOUSE";
        this.delivery=delivery.CREATED;
    }

    public void addObservers(ShippingEvents event)
    {
        obs.add(event);
    }
    public void removeObserver(ShippingEvents events)
    {
        obs.remove(events);
    }

    public void NotificationUser(ShippingEvents oldStatus,ShippingEvents newStatus)
    {
        ShippingEvents events = new ShippingEvents(shippingID, oldStatus, newStatus, currentLocation);

        for(ShippingObserver it:obs)
        {
            it.onStatusChange(events);
        }
    }

    public void updateStatus(ShippingEvents oldStatus, String location)
    {
        ShippingEvents oldStatus= this.status;
        this.currentLocation=location;
        this.status=oldStatus;
        NotificationUser(oldStatus, newStatus);
    }
}
