package framework;

import framework.ICommand;

public class ResizeCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
