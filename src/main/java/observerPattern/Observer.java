package observerPattern;

public class Observer implements IObserver {

    private String id;

    @Override
    public void update(Message m) {
        System.out.println(this + " " + m.getMessage());
    }

    public Observer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Observer{" +
                "id='" + id + '\'' +
                '}';
    }
}
