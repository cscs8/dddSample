import dddSample.FullName
import dddSample.User
import dddSample.UserName

class UserRepository : IUserRepository {
    override fun find(username: UserName): User? {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return User(username, FullName("firstName", "lastName"))
    }

    override fun save(user: User) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}