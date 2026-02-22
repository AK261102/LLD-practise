package ASHISH_CODE_HIMSELF.Shopping_Cart.Notification;

public class OrderSMSNotification {
    @Override
    public void onPlacedOrder(Order order)
    {
         System.out.println("  📧 Email: Order " + order.getOrderId() +
            " confirmed! Total: ₹" + String.format("%.2f", order.getTotal()));
    }
}
