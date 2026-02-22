package ASHISH_CODE_HIMSELF.Shopping_Cart;

import ASHISH_CODE_HIMSELF.Observer_Pattern_Practise.CustomerSMSNofitication;
import ASHISH_CODE_HIMSELF.Shopping_Cart.Models.Product;
import ASHISH_CODE_HIMSELF.Shopping_Cart.Services.CardService;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("P1", "Laptop", 1, 3);
        CardService cardService= new CardService();
        cardService.addObserver(CustomerSMSNofitication);

        cardService.addItems(p1, 1);
        cardService.checkout();
    }
}
