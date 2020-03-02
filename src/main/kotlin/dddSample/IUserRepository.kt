import dddSample.User
import dddSample.UserName

interface IUserRepository {
    fun find(username: UserName): User?
    fun save(user: User)
}