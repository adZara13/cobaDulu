fun main () {
nama()
mediasosial()
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