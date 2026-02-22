package ASHISH_CODE_HIMSELF.Notification_System;

class Notification {
    private final String userId;
    private final EventType event;
    private final ChannelType channel;
    private final String message;
    private final boolean success;
    private final LocalDateTime timestamp;

    public Notification(String userId, EventType event, ChannelType channel,
                        String message, boolean success) {
        this.userId = userId;
        this.event = event;
        this.channel = channel;
        this.message = message;
        this.success = success;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        String status = success ? "✅" : "❌";
        return status + " " + channel + " | " + event + " | " + userId;
    }
}