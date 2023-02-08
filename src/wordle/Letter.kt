package wordle

class Letter(
        val value: Char = NOT_YET_CHOSEN,
        val state: LetterState = LetterState.notYetChosen) {

    fun equals(that: Letter?): Boolean {
        return that != null && value == that.value
    }

    companion object {
        private const val NOT_YET_CHOSEN = 0.toChar()
    }
}