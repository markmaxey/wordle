package wordle;

final public class CandidateSolutions {
    private int currentGuess = 0;
    private final int totalPossibleGuesses;
    private final Word[] words;

    public CandidateSolutions(final int totalPossibleGuesses) {
        this.totalPossibleGuesses = totalPossibleGuesses;
        this.words = new Word[totalPossibleGuesses];
    }

    public Word[] getWords() {
        return words;
    }

    public void guess(final Word word) {
        words[currentGuess++] = word;
    }

    public boolean hasAnotherTurn() {
        return currentGuess < totalPossibleGuesses;
    }

    public boolean has(final Word solution) {
        for(int guessNum=0; guessNum < words.length; guessNum++) {
            if (words[guessNum].equals(solution)) return true;
        }
        return false;
    }
}