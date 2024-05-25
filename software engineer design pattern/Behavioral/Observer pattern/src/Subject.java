import java.util.ArrayList;
import java.util.List;

// Observable
public class Subject {
    private List<IObserver> observers = new ArrayList<>();

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }
    public <T> void notifyObservers(){
        for(var observer: observers)
            observer.update();
    }
}
