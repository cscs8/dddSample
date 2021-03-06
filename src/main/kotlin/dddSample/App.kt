/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package dddSample

import IUserRepository
import InMemoryUserRepository

class App(private val userRepository: IUserRepository) {
    val userService: UserService by lazy {
        UserService(userRepository)
    }

    fun createUser(userName: String, firstName: String, lastName: String) {
        val user = User(
                UserName(userName),
                FullName(firstName, lastName))
        if (userService.isDuplicated(user)) throw Exception("重複 : $user")
        userRepository.save(user)
    }
}

fun main(args: Array<String>) {
    println(App(InMemoryUserRepository())
            .createUser("id", "fname", "lname"))
}
