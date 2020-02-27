package dddSample

import java.util.*

data class User(val userId: UserId, val userName: UserName, val fullName: FullName) {
    constructor(userName: UserName, fullName: FullName)
            : this(UserId(UUID.randomUUID().toString()), userName, fullName)
}