package wordle

class WordleRulesController(
        val totalPossibleLetters: Int,
        totalPossibleGuesses: Int) {
    private val dictionary = Dictionary()
    private val solution: Word = dictionary.chooseSolution(totalPossibleLetters)
    val candidateSolutions: CandidateSolutions = CandidateSolutions(totalPossibleLetters, totalPossibleGuesses)

    val isGameOver: Boolean
        get() = hasGuessedTheCorrectWord() || !candidateSolutions.hasAnotherTurn()

    private fun hasGuessedTheCorrectWord(): Boolean {
        return candidateSolutions.has(solution)
    }

    fun guess(theGuess: CharArray) {
        candidateSolutions.guess(solution, theGuess)
    }
}