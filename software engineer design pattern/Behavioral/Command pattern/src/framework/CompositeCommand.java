package framework;

import framework.ICommand;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements ICommand {
    private List<ICommand> commands = new ArrayList<>();

    public void add(ICommand command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for(var command : commands)
            command.execute();
    }
}
