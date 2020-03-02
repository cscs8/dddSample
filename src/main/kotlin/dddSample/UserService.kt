package dddSample

import IUserRepository

class UserService(private val userRepository: IUserRepository) : IUserService {
    // TODO: 実装
    override fun isDuplicated(user: User): Boolean {
        val name = user.userName
        val searched = userRepository.find(name)
        return searched != null
    }
}