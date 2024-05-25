import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the application!");

        Pair pair = InputProcessor.process();

        if(!ViolationChecker.isValid(pair)) {
            System.out.println("One of the input is invalid");
            return;
        }

        int firstInteger = Integer.valueOf(pair.getFirst());
        int secondInteger = Integer.valueOf(pair.getSecond());

        int result = Operation.execute(firstInteger, secondInteger);

        System.out.println("The result is: " + result);
    }
}