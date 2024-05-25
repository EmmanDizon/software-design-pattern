import java.util.ArrayList;
import java.util.List;

public class Group implements IComponent {
    private List<IComponent> components = new ArrayList<>();

    public void add(IComponent component) {
        components.add(component);
    }

    @Override
    public void render() {
        for(var component: components)
            component.render();
    }

    @Override
    public void move() {
        for(var component: components)
            component.move();
    }
}
