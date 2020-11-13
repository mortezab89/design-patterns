package mediatorPattern;

public abstract class User {

    private IChatRoom iChatRoom;

    private long id;
    private String name;

    public User(IChatRoom iChatRoom, long id, String name) {
        this.iChatRoom = iChatRoom;
        this.id = id;
        this.name = name;
    }

    public IChatRoom getiChatRoom() {
        return iChatRoom;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void receiveMessage( String message);

    public abstract void sendMessage(Long userId, String message);

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
