public class Shape implements IComponent {
    @Override
    public void render() {
        System.out.println("Render shape");
    }

    @Override
    public void move() {
        System.out.println("Move shape");
    }
}
