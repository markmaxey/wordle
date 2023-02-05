package wordle;

final public class WordleRulesController {
    private final Dictionary dictionary = new Dictionary();
    private final Word solution;
    private final CandidateSolutions candidateSolutions;

    public WordleRulesController(
            final int totalPossibleLetters,
            final int totalPossibleGuesses) {
        solution = dictionary.chooseSolution(totalPossibleLetters);
        candidateSolutions = new CandidateSolutions(totalPossibleGuesses);
    }

    public boolean isGameOver() {
        return hasGuessedTheCorrectWord() || !candidateSolutions.hasAnotherTurn();
    }

    private boolean hasGuessedTheCorrectWord() {
        return candidateSolutions.has(solution);
    }

    public CandidateSolutions getCandidateSolutions() {
        return candidateSolutions;
    }

    public void guess(final Word candidateWord) {
        candidateSolutions.guess(candidateWord);
    }
}
