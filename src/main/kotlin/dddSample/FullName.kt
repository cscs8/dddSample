package dddSample

data class FullName(val firstName: String, val lastName: String) {
    init {
        if (firstName.length > 50) throw IllegalArgumentException()
        if (lastName.length > 50) throw IllegalArgumentException()
    }
}