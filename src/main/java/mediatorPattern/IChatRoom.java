package mediatorPattern;

import java.util.Map;

public interface IChatRoom {

    void addUser(User user);
    Map<Long, User> getUsers();

    void sendMessage(Long userId, String message);
}
