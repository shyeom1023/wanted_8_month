package org.project.portfolio.api.user.controller

import org.project.portfolio.api.user.persistence.entity.UserEntity
import org.project.portfolio.api.user.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController(
    private val service: UserService
) {

    @PostMapping
    fun create() {
        val user = UserEntity(
            userId = "testuser",
            password = "password",
            email = "test@example.com",
            phoneNo = "123-456-7890",
            updatedId = 1
        )
        service.create(user)
    }

}