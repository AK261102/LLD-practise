package PRACTISE.Parking_Alot.paymentStrategy;

/**
 * ══════════════════════════════════════════════════════════════════
 *              STEP 5: PAYMENT STRATEGY
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ STRATEGY PATTERN ⭐
 * 
 * WHY STRATEGY FOR PAYMENT?
 * ─────────────────────────
 * Multiple payment methods:
 *   - Cash
 *   - Credit/Debit Card
 *   - UPI (Google Pay, PhonePe)
 *   - (Future: Wallet, NetBanking)
 * 
 * Each has different processing logic.
 * Strategy Pattern allows easy addition of new methods!
 * 
 * 
 * STRUCTURE:
 * ──────────
 *       ┌────────────────────────┐
 *       │   PaymentStrategy      │
 *       │      (Interface)       │
 *       └───────────┬────────────┘
 *                   │
 *       ┌───────────┼───────────┐
 *       ▼           ▼           ▼
 *  ┌─────────┐ ┌─────────┐ ┌─────────┐
 *  │  Cash   │ │  Card   │ │   UPI   │
 *  │ Payment │ │ Payment │ │ Payment │
 *  └─────────┘ └─────────┘ └─────────┘
 */

public interface payment {
    
    boolean paymentMethod(int amount);
}
