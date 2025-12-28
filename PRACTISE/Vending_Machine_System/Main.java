package PRACTISE.Vending_Machine_System;

import PRACTISE.Vending_Machine_System.core.Coin;
import PRACTISE.Vending_Machine_System.states.VendingMachineState;
import PRACTISE.Vending_Machine_System.states.Vendingmachinecontext;

public class Main {
    public static void main(String[] args) {
        
        VendingMachineState machine = new Vendingmachinecontext(10);

        fillInventory(machine);

        machine.clickOnInsertCoinButton(Coin.TEN_RUPEES);

        machine.clickOnStartProductSelectionButton(101);
        machine.display();
    }
    
}
