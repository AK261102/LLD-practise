package ASHISH_CODE_HIMSELF.Observer_Pattern_Practise;

public class Main {
    public static void main(String[] args) {
        Shippment shippment=new Shippment("2367tr7w");
        shippment.addObservers(new CustomerEmailService("ak39r9r"));
        shippment.updateStatus(DeliveryStatus.CREATED, "ksndkjvk");
    }
}
