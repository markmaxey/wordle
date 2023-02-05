package wordle;

import java.util.Arrays;

import static wordle.LetterState.notYetChosen;

final public class Word {
    private static final char NO_LETTER = 0;
    private final int totalPossibleLetters;
    private final char[] letters;

    public Word(final int totalPossibleLetters) {
        this.totalPossibleLetters = totalPossibleLetters;

        letters = new char[totalPossibleLetters];
        Arrays.fill(letters, NO_LETTER);
    }

    public LetterState[] determineTheStateOfEachLetter(final Word solution) {
        return null; // TODO: Add actual logic here
    }

    public boolean equals(final Word that) {
        boolean isEquals = true;
        for(int letterNum=0; letterNum < totalPossibleLetters; letterNum++) {
            if (this.letters[letterNum] != that.letters[letterNum]) isEquals = false;
        }
        return isEquals;
    }
}
