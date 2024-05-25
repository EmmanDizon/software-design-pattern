import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<IHtmlNode> nodes = new ArrayList<>();

    public void add(IHtmlNode node) {
        nodes.add(node);
    }

    public void highlight() {
        for(var node: nodes)
            node.highlight();
    }
}
