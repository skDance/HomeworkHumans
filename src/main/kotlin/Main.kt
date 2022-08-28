fun main() {
    val likes = 10

    var declinationResult: String
    if (likes % 100 == 11 || likes % 10 != 1) {
        declinationResult = "людям"
    } else {
        declinationResult = "человеку"
    }

    println("Понравилось $likes $declinationResult")
}