import java.util.ArrayList;
import java.util.List;

// invoker
public class Switcher {
    public List<Command> commands;

    public  Switcher() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }
    public void executeCommand() {
        for(Command c: commands) {
            c.execute();
        }
    }
}
