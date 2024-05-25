import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context){
        var engine = createViewEngine();
        var result = engine.render(viewName, context);

        System.out.println(result);
    }

    protected ViewEngine createViewEngine() {
        return new MatchaViewEngine();
    }
}
