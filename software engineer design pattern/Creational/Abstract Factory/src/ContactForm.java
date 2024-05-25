public class ContactForm {
    public void render(WidgetFactory widget){
     widget.createTextBox().render();
     widget.createButton().render();
    }
}
