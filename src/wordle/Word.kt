package wordle

import java.util.*

class Word {
    private val totalPossibleLetters: Int
    private val letters: Array<Letter>

    constructor(totalPossibleLetters: Int) {
        this.totalPossibleLetters = totalPossibleLetters
        letters = Array(totalPossibleLetters) { Letter() }
        Arrays.fill(letters, Letter())
    }

    constructor(solution: Word, theGuess: CharArray) {
        totalPossibleLetters = theGuess.size
        letters = Array(theGuess.size) { ndx ->
            val letterState: LetterState = LetterState.notInWord // TODO: Add logic here to figure out the correct state
            Letter(theGuess[ndx], letterState)
        }
    }

    fun equals(that: Word?): Boolean {
        var isEquals = true
        for (letterNum in 0 until totalPossibleLetters) {
            if (letters[letterNum].equals(that!!.letters[letterNum])) isEquals = false
        }
        return isEquals
    }
}