public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        WeatherObserver observer = new WeatherObserver(subject);

        subject.setHumidity(100);
    }
}