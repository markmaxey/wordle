package wordle;

final public class WordleUserInterface {
    private final WordleRulesController wordleRulesController;

    public WordleUserInterface(final WordleRulesController wordleRulesController) {
        this.wordleRulesController = wordleRulesController;
    }

    public void run() {
        while(!wordleRulesController.isGameOver()) {
            renderCandidateSolutions(wordleRulesController.getCandidateSolutions());
            wordleRulesController.guess(guessAWord());
        }
        renderCandidateSolutions(wordleRulesController.getCandidateSolutions());
    }

    private Word guessAWord() {
        return null; // TODO: Ask for the user to actually guess a word
    }

    private void renderCandidateSolutions(final CandidateSolutions candidateSolutions) {
        // TODO: Do UI magic here - colors, styles, etc. based on each word's LetterStates
    }
}
