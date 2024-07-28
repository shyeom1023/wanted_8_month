package org.project.portfolio.api.user.persistence

import org.project.portfolio.api.user.persistence.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Int> {
}