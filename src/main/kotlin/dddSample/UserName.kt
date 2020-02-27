package dddSample

data class UserName(val userName: String) {
    init {
        if (userName.length > 50) throw IllegalArgumentException()
    }
}