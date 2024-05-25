package editor;

public interface IUndoableCommand extends ICommand{
    void unexecute();
}
