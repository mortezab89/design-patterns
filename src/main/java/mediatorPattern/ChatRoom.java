package mediatorPattern;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements IChatRoom {

    Map<Long, User> users = new HashMap();

    public void addUser(User user) {
        users.put(user.getId() ,user);
    }

    public Map<Long, User> getUsers() {
        return users;
    }

    public void sendMessage(Long userId, String message) {
        User user = users.get(userId);
        if(user == null)
            System.out.println("no such user: " + userId);
        else {
            user.receiveMessage(message);
        }
    }

}
