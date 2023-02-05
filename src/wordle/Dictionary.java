package wordle;

final public class Dictionary {
    public Word chooseSolution(int totalPossibleLetters) {
        // TODO: In real life, this would pull a random word from an actual dictionary database
        return new Word(totalPossibleLetters);
    }
}
