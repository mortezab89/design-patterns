package mediatorPattern;

import java.util.Map;

public class ChatUser extends User {

    public ChatUser(IChatRoom chatRoom, long i, String message) {
        super(chatRoom, i, message);
    }

    public void receiveMessage(String message) {
        System.out.println(this + " received: " + message);

    }

    public void sendMessage(Long userId, String message) {
        System.out.println(this + " says: " + message);
        getiChatRoom().sendMessage(userId, message);
    }




}
