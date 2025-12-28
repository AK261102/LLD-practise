package PRACTISE.Vending_Machine_System.states;

import java.util.ArrayList;
import java.util.List;

import PRACTISE.Vending_Machine_System.core.Coin;
import PRACTISE.Vending_Machine_System.inventory.Inventory;
import PRACTISE.Vending_Machine_System.inventory.Item;

/**
 * ══════════════════════════════════════════════════════════════════
 *          STEP 6: VENDING MACHINE CONTEXT
 * ══════════════════════════════════════════════════════════════════
 * 
 * The "Context" class in State Pattern
 * 
 * RESPONSIBILITIES:
 *   - Maintains current state
 *   - Holds machine data (inventory, coins, selected item)
 *   - Handles user actions (insert coin, select product)
 *   - Manages state transitions
 * 
 * 
 * USER FLOW:
 * ──────────
 *   1. User inserts coins → clickOnInsertCoinButton()
 *   2. User presses select → clickOnStartProductSelectionButton()
 *   3. User enters code → selectProduct()
 *   4. Machine dispenses → dispenseItem()
 *   5. Machine returns change
 */

public class Vendingmachinecontext {
    

    private VendingMachineState currentState;
    private Inventory inventory;
    private List<Coin> coinList;
    private int selectedItemCode;

    public Vendingmachinecontext(int shelfCount)
    {
        this.inventory = new Inventory(shelfCount);
        this.coinList = new ArrayList<>();
        this.selectedItemCode = 0;
        this.currentState = new IdleState();
    }

      
    /**
     * Get current state
     */
    public VendingMachineState getCurrentState() {
        return currentState;
    }
    
    /**
     * Advance to next state
     */
    public void advanceState() {
        VendingMachineState nextState = currentState.next(this);
        currentState = nextState;
    }
    

    public void clickOnInsertCoinButton(Coin coin)
    {
        String stateName= currentState.getStateName();
        if(stateName.equals("idle"))
        {
            coinList.add(coin);
            advanceState();
        }
    }
      public void clickOnStartProductSelectionButton(int code) {
        String stateName = currentState.getStateName();
        
        if (stateName.equals("HAS_MONEY")) {
            advanceState();  // Go to SELECTION state
            selectProduct(code);
        } else {
            System.out.println("❌ Must insert coins first!");
        }
    }

    public void selectProduct(int code)
    {
        String stateName = currentState.getStateName();
        try{
            Item item = inventory.getItem(code);
            int balance = getBalance();
            if(balance < item.getPrice())
            {

                return;
            }

            selectedItemCode = code;
            advanceState();
            dispenseItem(code);
            int change = balance - item.getPrice();
        }
        catch(Exception e)
        {

        }
    }

     private void dispenseItem(int code) {
        String stateName = currentState.getStateName();
        
        if (!stateName.equals("DISPENSE")) {
            System.out.println("❌ Cannot dispense in " + stateName + " state");
            return;
        }
        
        try {
            Item item = inventory.removeItem(code);
            System.out.println("\n╔════════════════════════════════════════════════╗");
            System.out.println("║  ✅ DISPENSING: " + item.getType());
            System.out.println("║  📦 Please collect your item from tray!       ║");
            System.out.println("╚════════════════════════════════════════════════╝\n");
            
            // Reset machine
            resetBalance();
            resetSelection();
            advanceState();  // Go back to IDLE
            
        } catch (Exception e) {
            System.out.println("❌ Dispense failed: " + e.getMessage());
            refundMoney();
            advanceState();
        }
    }
}
