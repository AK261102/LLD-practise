package ASHISH_CODE_HIMSELF.Notification_System.MessageStrategy;

import ASHISH_CODE_HIMSELF.Notification_System.Enum.ChannelType;

public interface NotificationChannel {
     void send(User user, String message);
     ChannelType getType();
}
