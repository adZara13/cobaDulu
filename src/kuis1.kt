fun main () {
nama()
mediasosial()
    sekolah()
}
fun nama () {
    var huruf: Char = 'A'
    print(huruf)
}
fun mediasosial () {
    var aplikasi = mutableMapOf(
        "IG" to "Instagram",
        "TT" to "TikTok",

        "WA" to "WhatsApp",
        "X" to "Twitter"
    )
    print(aplikasi["X"])
}

fun sekolah () {
        val kelas = "X.C"
        println("Aku saat ini belajar di kelas $kelas")
    }
