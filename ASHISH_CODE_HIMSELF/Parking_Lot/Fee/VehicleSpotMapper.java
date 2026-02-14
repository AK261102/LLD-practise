package ASHISH_CODE_HIMSELF.Parking_Lot.Fee;

import java.util.HashMap;
import java.util.Map;

import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.SpotType;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.VehicleType;

public class VehicleSpotMapper {
    private static final Map<VehicleType, SpotType> mapping = new HashMap<>();

    static {
        mapping.put(VehicleType.BIKE, SpotType.SMALL);
        mapping.put(VehicleType.CAR, SpotType.MEDIUM);
        mapping.put(VehicleType.TRUCK, SpotType.LARGE);
    }

    public static SpotType getRequiredSpot(VehicleType vehicleType)
    {
        return mapping.get(vehicleType);
    }
}
