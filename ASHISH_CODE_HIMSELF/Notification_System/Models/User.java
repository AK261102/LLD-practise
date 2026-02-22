package ASHISH_CODE_HIMSELF.Notification_System.Models;

import java.util.Set;

import ASHISH_CODE_HIMSELF.Notification_System.Enum.ChannelType;

public class User {
    private String user_id;
    private String phone;
    private String name;
    private String email;
    private Set<ChannelType> preferences;
    public User(String userId, String name, String email,
                String phone, Set<ChannelType> preferences) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.preferences = preferences;
    }

    public boolean setUserPreference(ChannelType chaneel)
    {
        return preferences.contains(chaneel);
    }
     public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}
