package ASHISH_CODE_HIMSELF.Observer_Pattern_Practise;

public class CustomerEmailService implements ShippingObserver {
    private String customerEmail;
    public ShippingObserver(String customerEmail)
    {
        this.customerEmail=customerEmail;
    }
    @Override
    public void onStatusChange(ShippingEvents events)
    {
        String subjectId=events.getShippingId;
        String
    }
}
