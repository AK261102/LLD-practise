package ASHISH_CODE_HIMSELF.Parking_Lot_Practise

import PRACTISE.Parking_Alot.core.Ticket;

-SELF.Services;

public class FeeCalculator {
    
    public double calculateFee(Ticket ticket)
    {
        int hours=ticket.getParkDuration(ticket);
        if(hours<=1)
        {
            hours=1;// mininum one hour charge
        }
        int price=ticket.getSpot().getHourlyRate();
        return price*hours;
    }

    public String getReceipt(Ticket ticket, double fee)
    {
        
    }
}
