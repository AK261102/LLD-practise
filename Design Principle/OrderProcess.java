// KISS-Compliant Code: Breaking down the logic into reusable methods

class Item{
    double price;
    int quantity;
    Item(double price,int quantity)
    {
        this.price=price;
        this.quantity=quantity;
    }
}
class OrderProcess{

    public static double calculateSubtotal(Item[] order)
    {
        double subtotal=0;
        for(Item item:order)
        {
            subtotal+=item.price*item.quantity;
        }
        return subtotal;
    }

    public static double calculateTotal(double subtotal,double taxrate){
        return subtotal+subtotal*taxrate;
    }
    public static void main(String[] args) {
        Item[] order={
            new Item(100,2),
            new Item(200,2)
        };
        double taxrate=0.1;
        double subcal=calculateSubtotal(order);
        double totcal=calculateTotal(subcal,taxrate);
        System.out.println(subcal);
        System.out.println(totcal);
    }
}