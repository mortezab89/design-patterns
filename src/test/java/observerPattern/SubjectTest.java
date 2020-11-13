package observerPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @Test
    public void test(){
        ISubject subject = new Subject();

        IObserver observer1 = new Observer("1");
        IObserver observer2 = new Observer("2");
        IObserver observer3 = new Observer("3");

        subject.attachAll(observer1, observer2, observer3);
        subject.notifyUpdate(new Message("new Message"));

        subject.detach(observer1);
        subject.notifyUpdate(new Message("2nd new Message"));

    }

}