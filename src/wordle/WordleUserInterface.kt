package wordle

class WordleUserInterface(private val wordleRulesController: WordleRulesController) {
    fun run() {
        while (!wordleRulesController.isGameOver) {
            renderCandidateSolutions(wordleRulesController.candidateSolutions)
            wordleRulesController.guess(guessAWord())
        }
        renderCandidateSolutions(wordleRulesController.candidateSolutions)
    }

    private fun guessAWord(): CharArray {
        // TODO: Ask for the user to actually guess a word
        return CharArray(wordleRulesController.totalPossibleLetters) { '-'}
    }

    private fun renderCandidateSolutions(candidateSolutions: CandidateSolutions) {
        // TODO: Do UI magic here - colors, styles, etc. based on each letter's value & LetterState
    }
}