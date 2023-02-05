package wordle;

public class Main {
    public static void main(String[] argv) {
        final int totalPossibleLetters = Integer.parseInt(argv[0]);
        final int totalPossibleGuesses = Integer.parseInt(argv[1]);

        WordleRulesController wordleRulesController =
                new WordleRulesController(totalPossibleLetters, totalPossibleGuesses);

        WordleUserInterface wordleUserInterface = new WordleUserInterface(wordleRulesController);
        wordleUserInterface.run();
    }
}