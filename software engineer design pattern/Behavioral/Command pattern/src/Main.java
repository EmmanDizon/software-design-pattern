import editor.BoldCommand;
import editor.History;
import editor.HtmlDocument;
import editor.UndoCommand;
import framework.BlackAndWhiteCommand;
import framework.CompositeCommand;
import framework.ResizeCommand;

public class Main {
    public static void main(String[] args) {
    /*
        var service = new framework.CustomerService();
        var command = new framework.AddCustomerCommand(service);

        var button = new Button(command);

        button.click();
     */

        var history = new History();
        var document = new HtmlDocument();

        document.setContent("Hello word");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();

        System.out.println(document.getContent());

    }
}