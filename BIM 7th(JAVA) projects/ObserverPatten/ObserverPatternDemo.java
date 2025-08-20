package ObserverPatten;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Updating the state will notify all observers
        subject.setState("New State");

        // Removing observer1
        subject.removeObserver(observer1);

        // Updating the state again will notify only observer2
        subject.setState("Updated State");
    }
}
