package wordle;

public class Letter {
    private static final char NOT_YET_CHOSEN = 0;
    private final char value;
    private final LetterState state;

    public Letter() {
        this(NOT_YET_CHOSEN, LetterState.notYetChosen);
    }

    public Letter(final char value, final LetterState state) {
        this.value = value;
        this.state = state;
    }

    public char getValue() {
        return value;
    }

    public LetterState getState() {
        return state;
    }

    public boolean equals(final Letter that) {
        return that != null && this.value == that.value;
    }
}