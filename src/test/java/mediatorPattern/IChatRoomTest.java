package mediatorPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IChatRoomTest {

    @Test
    public void test(){
        IChatRoom chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, 1, "morteza");
        User user2 = new ChatUser(chatRoom, 2, "ali");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        user1.sendMessage(2l, "Hi");

    }

}