package wordle

class Dictionary {
    fun chooseSolution(totalPossibleLetters: Int): Word {
        // TODO: In real life, this would pull a random word from an actual dictionary database
        return Word(totalPossibleLetters)
    }
}