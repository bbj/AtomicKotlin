fun main() {
    val whole = 11
    //whole = 15 // Error   // [1]
    val fractional = 1.4
    val words = "Twas Brillig"
    println(whole)
    println(fractional)
    println(words)
}

/*
[1] Once you initialize a val, you can’t reassign it. If we try to reassign whole to a different number,
    Kotlin complains, saying “Val cannot be reassigned.”
 */
