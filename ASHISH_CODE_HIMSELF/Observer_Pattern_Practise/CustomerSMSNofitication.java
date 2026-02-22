package ASHISH_CODE_HIMSELF.Observer_Pattern_Practise;

public class CustomerSMSNofitication {
    private String phoneNumber;
    public CustomerSMSNofitication(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    @Override
    public void ShippingEvents onStatusChange(ShippingEvents events)
    {
        if(events.getOldStatus==DeliveryStatus.DELIVERED || events.getOldStatus==DeliveryStatus.OUT_FOR_DELIVERY)
        {
            System.out.println("Message is deliver");
        }
    }
}
