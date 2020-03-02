package dddSample

interface IUserService {
    fun isDuplicated(user: User): Boolean
}