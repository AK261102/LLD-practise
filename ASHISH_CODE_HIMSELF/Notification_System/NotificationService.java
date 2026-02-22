package ASHISH_CODE_HIMSELF.Notification_System;

import java.util.ArrayList;
import java.util.HashMap;

import ASHISH_CODE_HIMSELF.Notification_System.Enum.ChannelType;
import ASHISH_CODE_HIMSELF.Notification_System.MessageStrategy.NotificationChannel;

public class NotificationService {
    private Map<EventType,String> template=new HashMap<>();
    private List<Notification> log = new ArrayList<>();
    void notifiy(EventType event, User user, Map<String,String> data){
        String template=template.get(events);
        String message=resolveTemplate(template,data,user);
        for(ChannelType ch:ChannelType.values)
        {
            NotificationChannel channel = ChannelFactory.getChannel(chype);
        }
    }
}
