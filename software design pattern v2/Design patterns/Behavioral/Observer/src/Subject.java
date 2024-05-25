import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int pressure;
    private int temperature;
    private int humidity;
    private List<Observer> observerList;

    public Subject() {
        this.observerList = new ArrayList<>();
    }


    public void addObserver(Observer observer) {
        observerList.add(observer);

    }


    public void removeObserver(Observer observer) {
        observerList.remove(observer);

    }

    public void notifyAllObeservers() {
        for(Observer o : observerList) {
            o.update(pressure, temperature, humidity);
        }

    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObeservers();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObeservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObeservers();
    }
}
