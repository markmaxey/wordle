package wordle

class CandidateSolutions(
        totalPossibleLetters: Int,
        private val totalPossibleGuesses: Int) {
    private var currentGuess = 0
    private val words = Array(totalPossibleGuesses) { Word(totalPossibleLetters) }

    fun guess(solution: Word, theGuess: CharArray) {
        words[currentGuess++] = Word(solution, theGuess)
    }

    fun hasAnotherTurn(): Boolean {
        return currentGuess < totalPossibleGuesses
    }

    fun has(solution: Word): Boolean {
        for (guessNum in words.indices) {
            if (words[guessNum].equals(solution)) return true
        }
        return false
    }
}