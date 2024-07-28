package org.project.portfolio.api.user.service

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito.*
import org.project.portfolio.api.user.persistence.UserRepository
import org.project.portfolio.api.user.persistence.entity.UserEntity
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class UserServiceTest {

    @MockBean
    private lateinit var userRepository: UserRepository

    @Test
    fun `test create user`() {
        val userService = UserService(userRepository)

        val user = UserEntity(
            userId = "testuser",
            password = "password",
            email = "test@example.com",
            phoneNo = "123-456-7890",
            updatedId = 1
        )

        `when`(userRepository.save(any(UserEntity::class.java))).thenReturn(user)

        userService.create(user)

        verify(userRepository, times(1)).save(user)
        assertNotNull(user.id)
    }
}