public class Question {
    String text;
    int answer;
    boolean answeredCorrectly;
    int difficulty;

    public Question(String text, int answer, boolean answeredCorrectly, int difficulty) {
        this.text = text;
        this.answer = answer;
        this.answeredCorrectly = answeredCorrectly;
        this.difficulty = difficulty;
    }
}


