package ASHISH_CODE_HIMSELF.Shipping_Tracking_System.Enum;

import java.util.Set;

public class ShippingStatus {
    CREATED,PICKUP,INTRANSIT,OUTDELIVER,DILIVER,FAILED,CANCEL;
    private Set<ShippingStatus> allowNext;

    static{
        CREATED.allowNext=Set.of(PICKUP,CANCEL);
        PICKUP.allowNext=Set.of(INTRANSIT);
        INTRANSIT.allowNext=Set.of(OUTDELIVER);
        OUTDELIVER.allowNext=Set.of(DELIVER,FAILED);
        DELIVER.allowNext=Set.of();
        FAILED.allowedNext          = Set.of(OUT_FOR_DELIVERY); // retry
    }

    public canTransmitTo(ShippingStatus status)
    {
        return allowNext.contain(status);
    }
}
