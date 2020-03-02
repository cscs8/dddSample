import dddSample.User
import dddSample.UserName

class InMemoryUserRepository : IUserRepository {
    private val data: Map<String, User> = mapOf()

    override fun find(username: UserName): User? {
        return this.data.map { it.value }.find { it.userName == username }
    }

    override fun save(user: User) {
        data.plus(user.userId.userId to cloneUser(user))
    }

    private fun cloneUser(user: User): User {
        return User(user.userId, user.userName, user.fullName)
    }

}