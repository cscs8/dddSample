package dddSample

import UserRepository

class UserService(private val userRepository: UserRepository) : IUserService{
    // TODO: 実装
    override fun isDuplicated(user: User): Boolean {
        val name = user.userName
        val searched = userRepository.find(name)
        return searched != null
    }
}