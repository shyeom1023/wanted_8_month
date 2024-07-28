package org.project.portfolio.api.user.persistence.entity

import jakarta.persistence.*
import org.project.portfolio.common.db.DefaultEntity

@Entity
@Table(name = "user")
class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    @Column(name = "user_id", nullable = false, length = 50)
    var userId: String = "",

    @Column(name = "password", nullable = false, length = 255)
    var password: String = "",

    @Column(name = "email", nullable = false, length = 50)
    var email: String = "",

    @Column(name = "phone_no", nullable = false, length = 20)
    var phoneNo: String = "",

    updatedId: Int = 0
) : DefaultEntity(updatedId = updatedId) {

}
