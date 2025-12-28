package PRACTISE.Vending_Machine_System.core;

/**
 * ══════════════════════════════════════════════════════════════════
 *                      COIN ENUM
 * ══════════════════════════════════════════════════════════════════
 * 
 * Represents different coin denominations accepted by the machine
 * 
 * Each coin has a VALUE in rupees
 * 
 * Example usage:
 *   Coin coin = Coin.FIVE_RUPEES;
 *   int value = coin.value;  // 5
 */
public enum Coin {
    ONE_RUPEE(1),
    TWO_RUPEES(2),
    FIVE_RUPEES(5),
    TEN_RUPEES(10);
    
    // ─────────────────────────────────────────────────────────────
    // VALUE ATTRIBUTE
    // ─────────────────────────────────────────────────────────────
    
    public final int value;  // Value in rupees
    
    // Constructor
    Coin(int value) {
        this.value = value;
    }
    
    /**
     * Get coin by value
     */
    public static Coin fromValue(int value) {
        for (Coin coin : values()) {
            if (coin.value == value) {
                return coin;
            }
        }
        throw new IllegalArgumentException("Invalid coin value: " + value);
    }
}
