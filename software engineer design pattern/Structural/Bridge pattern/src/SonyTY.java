public class SonyTY implements IDevice{
    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff");

    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: setChannel");
    }
}
