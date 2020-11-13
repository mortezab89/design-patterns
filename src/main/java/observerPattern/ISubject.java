package observerPattern;

public interface ISubject {

    void attach(IObserver o);
    void attachAll(IObserver... observers);
    void detachAll(IObserver... observers);
    void detach(IObserver o);
    void notifyUpdate(Message m);
}
