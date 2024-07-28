package org.project.portfolio.api.user.service

import org.project.portfolio.api.user.persistence.UserRepository
import org.project.portfolio.api.user.persistence.entity.UserEntity
import org.springframework.stereotype.Service

@Service
class UserService(
    private val repository: UserRepository
) {

    fun create(entity: UserEntity) {
        repository.save(entity)
    }
}