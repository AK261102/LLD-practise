package ASHISH_CODE_HIMSELF.Parking_Lot_Practise

import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingFloor;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingSpot;

-SELF;

public class Main {
    public static void main(String[] args) {
        ParkingLotService lot = ParkingLotService.getInstance;
        ParkingFloor floor1 = new ParkingFloor(1);
        for(int i=0;i<3;i++)
        {
            floor1.addSpot(new ParkingSpot("F1-C"+i, SpotType.COMPACT,1));
        }
        lot.addFloor(floor1);

    }
}
