package observerPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subject implements ISubject {

    List<IObserver> observers = new ArrayList<IObserver>();

    public void attach(IObserver o) {
        observers.add(o);
    }

    @Override
    public void attachAll(IObserver... observers) {
        Arrays.stream(observers).forEach(t->this.observers.add(t));
    }

    @Override
    public void detachAll(IObserver... observers) {
        Arrays.stream(observers).forEach(t->this.observers.remove(t));
    }

    public void detach(IObserver o) {
        observers.remove(o);
    }

    public void notifyUpdate(Message mm) {
        observers.stream().forEach(t->t.update(mm));
    }
}
