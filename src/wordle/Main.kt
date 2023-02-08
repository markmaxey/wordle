package wordle

object Main {
    @JvmStatic
    fun main(argv: Array<String>) {
        val totalPossibleLetters = argv[0].toInt()
        val totalPossibleGuesses = argv[1].toInt()
        val wordleRulesController = WordleRulesController(totalPossibleLetters, totalPossibleGuesses)
        val wordleUserInterface = WordleUserInterface(wordleRulesController)
        wordleUserInterface.run()
    }
}