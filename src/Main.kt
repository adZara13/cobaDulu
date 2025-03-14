fun main () {
    singkatanGaol()
    akuarium()
    spotify()
}

fun singkatanGaol () {
    val singkatanIng = mutableMapOf(
        "OTW" to "On the way",
        "OMW" to "On my way",
        "OMG" to "Oh my god",
        "ILYSM" to "I love you so much"
    )
    println(singkatanIng)
}

fun akuarium () {
    val kolam = mutableListOf("Ikan Koi", "Ikan Nila", "Ikan Mas", "Ikan Cupang")
    println(kolam)
}

fun spotify () {
    val laguHappy = mutableMapOf(
        "Feast" to "NIna",
        "Nidji" to "Rahasia hati",
        "The Script" to "Breakeven"
    )
    println(laguHappy)
}
