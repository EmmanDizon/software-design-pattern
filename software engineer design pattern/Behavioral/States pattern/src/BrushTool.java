public class BrushTool implements ITool {
    @Override
    public void mouseDown() {
        System.out.println("Brush tool mouse down");
    }

    @Override
    public void mouseUp() {
        System.out.println("Brush tool mouse up");
    }
}
