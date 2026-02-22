package ASHISH_CODE_HIMSELF.Notification_System;

import ASHISH_CODE_HIMSELF.Notification_System.Enum.ChannelType;
import ASHISH_CODE_HIMSELF.Notification_System.MessageStrategy.EmailChannel;
import ASHISH_CODE_HIMSELF.Notification_System.MessageStrategy.NotificationChannel;

public class ChannelFactory {
    private Map<ChannelType,NotificationChannel> channels= Map.of(ChannelType.EMAIL,new EmailChannel());
    public NotificationChannel getChannelType(ChannelType type)
    {
        NotificationChannel channel=channels.get(type);
        return channel;
    }
}
