package ASHISH_CODE_HIMSELF.Notification_System.MessageStrategy;

import ASHISH_CODE_HIMSELF.Notification_System.Enum.ChannelType;

public class EmailChannel implements NotificationChannel {
    @Override
    public void send(User user, String message)
    {
        System.out.println("    📧 EMAIL → " + user.getEmail() + ": " + message);
    }
    @Override
    public ChannelType getType()
    {
        return ChannelType.EMAIL;
    }
}
