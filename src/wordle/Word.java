package wordle;

import java.util.Arrays;

final public class Word {
    private final int totalPossibleLetters;
    private final Letter[] letters;

    public Word(final int totalPossibleLetters) {
        this.totalPossibleLetters = totalPossibleLetters;

        letters = new Letter[totalPossibleLetters];
        Arrays.fill(letters, new Letter());
    }

    public Word(final Word solution, final char[] theGuess) {
        this.totalPossibleLetters = theGuess.length;
        letters = new Letter[theGuess.length];
        for(int ndx=0; ndx<theGuess.length; ndx++) {
            final LetterState letterState = null; // TODO: Add logic here to figure out the correct state
            letters[ndx] = new Letter(theGuess[ndx], letterState);
        }
    }

    public boolean equals(final Word that) {
        boolean isEquals = true;
        for(int letterNum=0; letterNum < totalPossibleLetters; letterNum++) {
            if (this.letters[letterNum] != that.letters[letterNum]) isEquals = false;
        }
        return isEquals;
    }
}
