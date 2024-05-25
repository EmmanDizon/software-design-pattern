package framework;

import framework.ICommand;

public class BlackAndWhiteCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
