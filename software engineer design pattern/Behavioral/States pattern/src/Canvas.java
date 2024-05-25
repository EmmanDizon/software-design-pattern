public class Canvas {
    private ITool currentTool;

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void setCurrentTool(ITool currentTool) {
        this.currentTool = currentTool;
    }
}
