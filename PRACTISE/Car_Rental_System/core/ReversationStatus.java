package PRACTISE.Car_Rental_System.core;

public enum ReversationStatus {
    PENDING,       // Created, awaiting payment
    CONFIRMED,     // Payment done, awaiting pickup
    IN_PROGRESS,   // Vehicle with customer
    COMPLETED,     // Rental finished
    CANCELED   
}
