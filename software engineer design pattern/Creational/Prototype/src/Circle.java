public class Circle implements  IComponent{
    private int radius;

    @Override
    public void render() {
        System.out.println("Rendering a circle");
    }

    @Override
    public IComponent clone() {
        Circle newCircle = new Circle();
        newCircle.setRadius(radius);

        return newCircle;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
