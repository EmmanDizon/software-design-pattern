public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("e");
        history.push(editor.createState());

        editor.setContent("m");
        history.push(editor.createState());

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("n");

        editor.restore(history.pop());

        System.out.println(editor.getContent());

    }
}