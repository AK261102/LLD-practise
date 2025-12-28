package PRACTISE.Vending_Machine_System.states;


public class IdleState implements VendingMachineState
{
    public IdleState()
    {
        System.out.println("waiting for the coins");
    }

    @Override
    public String getStateName()
    {
        return "IDLE";
    }
    @Override
    public VendingMachineState next(VendingMachineState context)
    {
        if(!context.getCoinList().isEmpty())
            return new HasMoneyState();
        return this;
    }
}

public class HasMoneyState implements VendingMachineState{
    
    public HasMoneyState()
    {
        System.out.println("has money please select a product");
    }

    @Override
    public String getStateName()
    {
        return "HAS_MONEY";
    }

    @Override
    public VendingMachineState next(VendingMachineState context)
    {
        

        return new SelectionState();
    }
}

class DispenseState implements VendingMachineState {
    
    public DispenseState() {
        System.out.println("📦 State: DISPENSE - Dispensing product...");
    }
    
    @Override
    public String getStateName() {
        return "DISPENSE";
    }
    
    @Override
    public VendingMachineState next(VendingMachineContext context) {
        // After dispensing, always go back to idle
        return new IdleState();
    }
}

// ═══════════════════════════════════════════════════════════════════
// OUT OF STOCK STATE
// ═══════════════════════════════════════════════════════════════════

/**
 * Machine has no items
 * 
 * ALLOWED ACTIONS:
 *   ✓ Restock → go to IdleState
 *   ✗ All user operations disabled
 */
class OutOfStockState implements VendingMachineState {
    
    public OutOfStockState() {
        System.out.println("⚠️ State: OUT_OF_STOCK - Please restock!");
    }
    
    @Override
    public String getStateName() {
        return "OUT_OF_STOCK";
    }
    
    @Override
    public VendingMachineState next(VendingMachineContext context) {
        // If restocked, go back to idle
        if (context.getInventory().hasItems()) {
            return new IdleState();
        }
        
        // Stay out of stock
        return this;
    }



    class SelectionState implements VendingMachineState {
        
        public SelectionState()
        {

        }

        @Override
        public VendingMachineState next(VendingMachineState context)
        {
            if(!context.getInventory().hasItems())
                return new OutOfStockState();

            if(context.getCoinList().isEmpty())
                return new IdleState();

            if(context.getSelectItemCode() > 0)
                return new DispenseState();

            return this;
        }
    }