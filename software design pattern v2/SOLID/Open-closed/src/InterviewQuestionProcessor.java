public class InterviewQuestionProcessor {
    public static void process(InterviewQuestion question) {
        // typical implementation of the loosely coupled system
        // this class knows nothing about the question and its type
        // this is pure abstraction

        question.execute();
    }
}
