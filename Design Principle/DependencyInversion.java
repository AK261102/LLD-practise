public interface MessageChannel {
    void sendMessage(String message);
}
public class EmailSender implements MessageChannel {
    @Override
    public void sendMessage(String message) {
        System.out.println("This is an email message: "+message );
    }
}

public class MessageSender implements MessageChannel {
    @Override
    public void sendMessage(String message) {
        System.out.println("This is message sent: "+ message);
    }
}
public class NotificationService {
    private final MessageChannel channel;
    public NotificationService(MessageChannel channel) {
        this.channel=channel;
    }
    public void sendNotification(String message) {
        channel.sendMessage(message);
    }
}

public class DependencyInversion {
     public static void main(String[] args) {
        MessageChannel emailChannel = new EmailSender();
        NotificationService emailService = new NotificationService(emailChannel);
        emailService.sendNotification("This is my home coming");
        System.out.println("-----------------------------------------------");
        MessageChannel messageChannel = new MessageSender();
        NotificationService smService = new NotificationService(messageChannel);
        smService.sendNotification("this is my new home");
     }
}